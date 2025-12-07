# Development version and branch handling

## Table of Contents

- [Branches](#branches)
- [Version numbers](#version-numbers)
  - [GitHub action flows](#github-action-flows)
- [How to develop](#how-to-develop)

## Branches

Versioning policy of JUDO NG modules are based on GitFlow: https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow.

Branches:

* **develop**: development branch contains latest development sources of the last active version
* **feature/JNG-NUMBER_short_summary**: feature branches are based on **develop** and contains sources of new features that will be included in last active version
* **(release/)1_0_beta1**: release branches of 1.0-beta1 (release/ prefix is still reserved for CI)
* **bugfix/JNG-NUMBER_short_summary**, **support/JNG-NUMBER_short_summary**: bugfix and support branches are based on release branches and must be applied to release and development branches of newer versions too
* **master**: contains latest released sources of the last active version

```mermaid
gitGraph
   commit id: "init"
   branch develop
   checkout develop
   commit id: "dev-1"
   branch feature/JNG-1
   checkout feature/JNG-1
   commit id: "feat-1"
   commit id: "feat-2"
   checkout develop
   branch feature/JNG-2
   checkout feature/JNG-2
   commit id: "feat-3"
   checkout develop
   merge feature/JNG-2
   checkout feature/JNG-1
   commit id: "feat-4"
   checkout develop
   merge feature/JNG-1
   commit id: "dev-2"
   branch feature/JNG-3
   checkout feature/JNG-3
   commit id: "feat-5"
   checkout develop
   merge feature/JNG-3
   branch release/1.0-beta1
   checkout release/1.0-beta1
   commit id: "rel-1"
   branch bugfix/JNG-4
   checkout bugfix/JNG-4
   commit id: "bugfix-1"
   checkout release/1.0-beta1
   merge bugfix/JNG-4
   checkout develop
   merge release/1.0-beta1
   branch release/1.0-beta2
   checkout release/1.0-beta2
   commit id: "rel-2"
   branch support/JNG-5
   checkout support/JNG-5
   commit id: "support-1"
   checkout release/1.0-beta2
   merge support/JNG-5
   checkout main
   merge release/1.0-beta2
   branch hotfix/JNG-6
   checkout hotfix/JNG-6
   commit id: "hotfix-1"
   checkout main
   merge hotfix/JNG-6
   checkout develop
   merge hotfix/JNG-6
```

## Version numbers

Version numbers are increased using semantic versioning:

* do not change version numbers on starting feature/ branches
* 2nd number in version of **develop** branch is increased when a release branch started
* do not change version numbers on bugfix/ branches - that are applied on release branches during testing before releasing it (merging to master)
* 3rd number in version of support/ branches is increased when started - it is used to support a previous release including new (minor) changes; support/ branches are merged back to release branch when update is released (without merging changes to master)
* 4th number in version of hotfix/ branches is increased when started (that are applied on both release and master branches)

### GitHub action flows

#### build.yml

```mermaid
flowchart TD
    A[/"<b>when</b><br/>push on <b>develop</b> branch<br/>or<br/>pull request on <b>develop</b>, <b>master</b>,<br/><b>increment/*</b>, <b>release/*</b> branch"/]
    A --> B{Commit or Pull request's<br/>base branch?}
    B -->|master, release/*| C["set <b>version</b><br/>from project <b>pom.xml</b><br/>(version without '-SNAPSHOT')"]
    B -->|develop, increment/*| D["set version<br/><b>major.minor.qualifier.date_commitId_branchName</b><br/>from project <b>pom.xml</b><br/>(version without '-SNAPSHOT')"]
    C --> E[build and deploy to nexus]
    D --> E
    E --> F["create git tag <b>v&lt;version&gt;</b>"]
    F --> G{Pull request or commit<br/>base branch?}
    G -->|increment/*, release/*| H["create tag <b>merge-pr/&lt;version&gt;</b>"]
    H --> I[/<b>trigger merge-pr-tagged.yml</b>/]
    G -->|develop| J[build change log]
    J --> K["create <b>github release</b><br/>(prerelease) with change log"]
    G -->|other| L([End])
    I --> L
    K --> L
```

---

#### merge-pr-tagged.yml

```mermaid
flowchart TD
    A[/"<b>when</b><br/>push on <b>merge-pr/*</b> tag"/]
    A --> B["get &lt;version&gt; from tag name"]
    B --> C{"check &lt;version&gt; format"}
    C -->|major.minor.qualifier| D["merge pull request to <b>master</b>"]
    D --> E[/<b>trigger create-release-on-master.yml</b>/]
    C -->|other| F["squash pull request to <b>develop</b>"]
    F --> G[/<b>trigger build.yml</b>/]
    E --> H["delete tag <b>merge-pr/&lt;version&gt;</b>"]
    G --> H
    H --> I([End])
```

---

#### create-release-on-master.yml

```mermaid
flowchart TD
    A[/"<b>when</b><br/>push on <b>master</b> branch"/]
    A --> B["get &lt;version&gt; from tag name"]
    B --> C[build change log]
    C --> D["create <b>github release</b><br/>(last) with change log"]
    D --> E([End])
```

---

#### release.yml

```mermaid
flowchart TD
    A[/"<b>when</b><br/>manually triggered with <b>given version</b><br/>which is <b>'auto'</b> or any other<br/>in <b>major.minor.qualifier</b> form"/]
    A --> B{"given version is"}
    B -->|'auto'| C["set <b>release version</b><br/>from project <b>pom.xml</b><br/>(version without '-SNAPSHOT')"]
    B -->|other| D["set <b>release version</b><br/>to given <b>version</b>"]
    C --> E["set <b>next version</b> to<br/><b>release version</b>'s qualifier + 1"]
    D --> E
    E --> F["create pull request on <b>master</b><br/>with <b>release version</b>"]
    F --> G[/<b>trigger build.yml</b>/]
    F --> H["create pull request on <b>develop</b><br/>with <b>next version</b>"]
    H --> I[/<b>trigger build.yml</b>/]
    G --> J([End])
    I --> J
```

## How to develop

For issue tracking we are using [JIRA](https://blackbelt.atlassian.net/jira/dashboards). Golden rule:

> **IMPORTANT**: *There is no commit without ticket number*

So for pull request or commit `JNG-xxx` have to be presented in the commit.
