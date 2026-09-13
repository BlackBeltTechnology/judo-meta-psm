# `test-project.yaml` (base root)

Generator descriptor consumed as the first `<uris>` entry of the
`judo-psm-generator-maven-plugin:generate` executions. The basename must match the plugin's
`<type>test-project</type>`; `templateName` paths resolve relative to this directory.

## `templates` entries

| name | actorTypeBased | pathExpression | templateName | note |
|---|---|---|---|---|
| `testOverride` | `true` | `#actorType.name + '/actorToOverride'` | `test1/actorToOverride.hbs` | decorated, not replaced, by the override root |
| `testReplace` | `true` | `#actorType.name + '/actorToReplace'` | `test1/actorToReplace.hbs` | rebound by the override root to a different path + template |
| `testDelete` | `true` | `#actorType.name + '/actorToDelete'` | `test1/actorToDelete.hbs` | cancelled by the override root's `exclude: true` |
| `testNotGenerated` | `true` | `#actorType.name + '/actorToNotGenerated'` | `test1/actorToNotGenerated.hbs` | `conditionExpression: false` — must never emit |
| `baseFactory` | `false` | `#self + '.baseFactory'` | `test1/baseFactory.hbs` | `factoryExpression: #stringListFactory` |
| `language` | `true` | `#actorType.name + '/lang_' + #self + '.properties'` | `test1/language.hbs` | `factoryExpression: #languages` |

## Contracts

- Entries are matched across descriptor roots by `name`. Renaming one here turns the override
  root's same-named entry from an override into an unrelated additional template.
- `baseFactory` is the only `actorTypeBased: false` entry, so `#actorType` is unavailable in its
  path expression — it fans out purely over `#stringListFactory`, supplied by
  `../generator-parameter.properties` (`test1,test2,test3`).
- `language` fans out over `#languages`, supplied by the plugin's `<templateParameters>` in the
  module `pom.xml` (`hu,en`). Adding a language there adds output files without touching this file.
- Both factory entries bind `#self` to the current fan-out token; `#self` is undefined in
  non-factory entries.
