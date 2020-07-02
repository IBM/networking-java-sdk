# IBM Cloud Java SDK Template Usage Instructions

This repository serves as a template for Java SDKs that are produced with the
[IBM OpenAPI SDK Generator](https://github.ibm.com/CloudEngineering/openapi-sdkgen).

You can use the contents of this repository to create your own Java SDKs.

## Table of Contents
<!--
  The TOC below is generated using the `markdown-toc` node package.

      https://github.com/jonschlinkert/markdown-toc

  You should regenerate the TOC after making changes to this file.

      markdown-toc -i --maxdepth 4 README_FIRST.md
  -->

<!-- toc -->

- [How to use this repository](#how-to-use-this-repository)
  * [1. Create your new github repository from this template](#1-create-your-new-github-repository-from-this-template)
  * [2. Sanity-check your new repository](#2-sanity-check-your-new-repository)
  * [3. Modify selected files](#3-modify-selected-files)
  * [4. Add one or more services to the project](#4-add-one-or-more-services-to-the-project)
  * [5. Build and test the project](#5-build-and-test-the-project)
- [Integration tests](#integration-tests)
- [Continuous Integration](#continuous-integration)
  * [Release management with semantic-release](#release-management-with-semantic-release)
  * [Encrypting secrets](#encrypting-secrets)
- [Setting the ``User-Agent`` Header In Preparation for SDK Metrics Gathering](#setting-the-user-agent-header-in-preparation-for-sdk-metrics-gathering)

<!-- tocstop -->

## How to use this repository

### 1. Create your new github repository from this template
This SDK template repository is implemented as a
[github template](https://help.github.com/en/github/creating-cloning-and-archiving-repositories/creating-a-repository-from-a-template),
which makes it easy to create new projects from it.

To create a new SDK repository from this template, follow these instructions:  
1. In your browser, open the link for this
[template repository](https://github.ibm.com/CloudEngineering/java-sdk-template).

2. Click on the `Use this template` button that appears next to the `Clone or download` button.

3. In the next window:  
- Select the `Owner`. This is the github id or organization where the new repository should be created
- Enter the respository name (e.g. `platform-services-java-sdk`):  
  - Recommendation: use a name of the form `<service-category>-<language>-sdk`, where:  
    - `<service-category>` refers to the IBM Cloud service category associated with the services that
	  will be included in the project (e.g. `platform-services`)
    - `<language>` is the language associated with the SDK project (e.g. `java`)
	
4. Click the `Create repository from template` button to create the new repository  

If your goal is to create the new SDK repository on the `Github Enterprise` server (github.ibm.com),
then you are finished creating the new repository and you can proceed to section 2.

On the other hand, if your goal is to create the new SDK repository on the `Public Github` server (github.com),
then perform these additional steps:

5. Create a new **EMPTY** repository on the Public Github server:  
- Select "No template" for the "Repository template" option
- Select the `Owner` (your personal id or an organization)
- Enter the same respository name that you used when creating the new repository above (e.g. my-java-sdk)
- Do NOT select the `Initialize this repository with a README` option
- Select `None` for the `Add .gitignore` and `Add a license` options
- Click the `Create repository` button.
- After the new empty repository has been created, you will be at the main page
of your new repository, which will include this text:
```
...or push an existing repository from the command line

git remote add origin git@github.com:padamstx/my-java-sdk.git
git push -u origin master
```
- Take note of the two git commands listed above for your new repository, as we'll execute these later

6. Clone your new `Github Enterprise` repository (created in steps 1-3 above)
to your local development environment:  

```sh
[/work/demos]
$ git clone git@github.ibm.com:phil-adams/my-java-sdk.git
Cloning into 'my-java-sdk'...
remote: Enumerating objects: 36, done.
remote: Counting objects: 100% (36/36), done.
remote: Compressing objects: 100% (32/32), done.
remote: Total 36 (delta 1), reused 0 (delta 0), pack-reused 0
Receiving objects: 100% (36/36), 28.74 KiB | 577.00 KiB/s, done.
Resolving deltas: 100% (1/1), done.
```

7. "cd" into your project's root directory:

```sh
[/work/demos]
$ cd my-java-sdk
[/work/demos/my-java-sdk]
$ 
```

8. Remove the existing remote:  
```sh
[/work/demos/my-java-sdk]
$ git remote remove origin
```

9. Add a new remote which reflects your new `Public Github` repository:

```sh
[/work/demos/my-java-sdk]
$ git remote add origin git@github.com:padamstx/my-java-sdk.git
```

10. Push your local repository to the new remote (Public Github):  

```sh
[/work/demos/my-java-sdk]
$ git push -u origin master
Enumerating objects: 36, done.
Counting objects: 100% (36/36), done.
Delta compression using up to 12 threads
Compressing objects: 100% (31/31), done.
Writing objects: 100% (36/36), 28.74 KiB | 28.74 MiB/s, done.
Total 36 (delta 1), reused 36 (delta 1)
remote: Resolving deltas: 100% (1/1), done.
To github.com:padamstx/my-java-sdk.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.
```

You have now created your new SDK repository on the `Public Github` server.

You may want to now delete the new SDK repository that you created on the `Github Enterprise`
server since it will no longer be used now that you have created your repository on `Public Github`.


### 2. Sanity-check your new repository
After creating your new project from the template repository, and cloning it in your local
development environment, you can do a quick sanity check by running this command in
the project root directory:
```
mvn package
```
You should see output like this:
```
$ mvn package
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO]
.
.    ...maven output...
.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 7.416 s
[INFO] Finished at: 2020-03-27T17:53:36-05:00
[INFO] Final Memory: 40M/716M
[INFO] ------------------------------------------------------------------------
```

### 3. Modify selected files

- In this section, you'll modify various files within your new SDK repository to reflect
the proper names and settings for your specific project.

- The template repository comes with an example service included, but this should be removed
from your project:
  - Remove the `modules/example-service` directory and its contents
  - Comment out the "example-service" module entry from the list of modules in the parent pom.xml file
    (look for ">>> List each service's module here")

- Next, decide on the appropriate java main package name for your project.
  This should use the pattern `com.ibm.cloud.<service_category>` (e.g. com.ibm.cloud.platform_services).
  This value should also be used as the `apiPackage` option when generating SDK code. More on this later.

- Next, here is a list of the various files within the project with comments
that will guide you in the required modifications:

  - `pom.xml`: this is the top-level maven build script (parent pom):
    - follow the instructions within this file (look for each ">>>")

  - `modules/common/pom.xml`:  
    - follow the instructions within this file (look for each ">>>")

  - `modules/common/src/main/java/com/ibm/cloud/my_services/common/SdkCommon.java`:
    - Rename the "my_services" part of the pathname to be the last part of the project's main package name
      (e.g. `platform_services`).
    - follow the instructions within this file (look for each ">>>")

  - `modules/common/src/test/java/com/ibm/cloud/my_services/common/test/SdkCommonTest.java`:
    - Rename the "my_services" part of the pathname to be the last part of the project's main package name
      (e.g. `platform_services`).
    - follow the instructions within this file (look for each ">>>")

  - `modules/common/src/main/resources/my-services.properties`
    - Rename this file so that the base name of the file reflects the parent project's artifactId
      (e.g. platform-services.properties)

  - `modules/coverage-reports/pom.xml`:
    - follow the instructions within this file (look for each ">>>")

  - `service-pom.xml`: this is a template for creating pom.xml files for new modules added to the project,
    and will be used later when generating the SDK code for your services.
    - Edit the file and make these changes:
      - Replace `PARENT-ARTIFACTID` with the parent project's artifactId (e.g. platform-services)
      - Replace `COMMON-ARTIFACTID` with the common module's artifactId (e.g. platform-services-common)

  - `.travis.yml`:
    - Remove the `jobs` section as it is applicable only to the template repository's build.
    
  - `README.md`:
    - Change the title to reflect your project; leave the version in the title as `0.0.1`
    - Change `[IBM Cloud My Services]` to reflect your project
      (e.g. `[IBM Cloud Platform Services]`)
    - Change the `cloud.ibm.com/apidocs` link to reflect the correct service category
      (e.g. `platform-services`)
    - In the Overview section, modify `IBM Cloud My Services Java SDK` to reflect your project
      (e.g. `IBM Cloud Platform Services Java SDK`)
    - In the table of services, remove the entry for the example service; later you'll list each
      service contained in your SDK project in this table, along with a link to the online reference docs
      and the name of the generated service artifact.
    - In the Installation section:
      - Update the dependency examples within the "All the services" section
        to reflect your parent project's artifact id (e.g. change "my-services" to "platform-services")
      - Update the dependency examples within the "A single service" section
        to reflect the artifactId of ONE OF your services (e.g. change "example-service" to
        "resource-controller")
    - In the "Issues" section, modify `<github-repo-url>` to reflect the Github URL for your project.
    - Note that the README.md file contains a link to a common README document where general
      SDK usage information can be found.
    - When finished, read through the document and make any other changes that might be necessary.

  - `CONTRIBUTING.md`:
    - In the "Issues" section, modify `<github-repo-url>` to reflect the Github URL for your project.

At this point, it's probably a good idea to commit the changes that you have made so far.
Be sure to use proper commit messages when committing changes (follow the link in `CONTRIBUTING.md`
to the common CONTRIBUTING document).  
Example:
```sh
cd <project-root>
git add .
git commit -m "chore: initial SDK project setup"
```


### 4. Add one or more services to the project
For each service that you'd like to add to your SDK project, follow
[these instructions](https://github.com/IBM/ibm-cloud-sdk-common/blob/master/CONTRIBUTING_java.md#adding-a-new-service).


### 5. Build and test the project
If you made it this far, congratulate yourself!

After generating the service and unit test code for your services, it's time to build
and test your project.   To do that, run this command in the project root directory:
```
mvn package
```

If your build was clean, you can examine the following for test and coverage results:
1. `modules/<module-name>/target/surefire-reports/index.html` - contains the unit test results for a particular module.
2. `modules/coverage-reports/target/site/jacoco-aggregate/index.html` - contains an aggregate test coverage report
for the project.


## Integration tests
Integration tests must be developed by hand.
For integration tests to run properly with an actual running instance of the service,
credentials (e.g. IAM api key, etc.) must be provided as external configuration properties.
Details about this can be found
[here](https://github.com/IBM/ibm-cloud-sdk-common/blob/master/README.md#using-external-configuration).

An example integration test is located at
[ExampleServiceIT.java](https://github.ibm.com/CloudEngineering/java-sdk-template/blob/master/modules/example-service/src/test/java/com/ibm/cloud/my_services/example_service/v1/ExampleServiceIT.java).

In order to run the "example service" integration test,
you'll need an actual running instance of the example service.
To run this service, clone the [Example Service repo](https://github.ibm.com/CloudEngineering/example-service)
and follow the instructions there for how to start up an instance of the example service.


## Continuous Integration
This repository is set up to use [Travis](https://travis-ci.com/)
or [Travis Enterprise](https://travis.ibm.com) for continuous integration.

The `.travis.yml` file contains all the instructions necessary to run the build.

For details related to the `travis.yml` file, see
[this](https://docs.travis-ci.com/user/customizing-the-build/)

### Release management with semantic-release
The `.travis.yml` file included in this template repository is configured to
perform automated release management with
[semantic-release](https://semantic-release.gitbook.io/semantic-release/).

When you configure your SDK project in Travis, be sure to set these environment variables in your
Travis build settings:  
- `GH_TOKEN`: set this to the Github oauth token for a user having "push" access to your repository

If you are using `Travis Enterprise` (travis.ibm.com), you'll need to set these additional
environment variables as well:  
- `GH_URL`: set this to the string `https://github.ibm.com`
- `GH_PREFIX`: set this to the string `/api/v3`

And if you are going to be deploying your project's jars to an internal Artifactory repository,
set these additional environment variables as well:
- `ARTIFACTORY_APIKEY`: set this to the Artficatory API key for a user that has write access to
  the internal Artifactory repository where your jars will be deployed
- `ARTIFACTORY_USER`: set this to the username associated with the Artifactory API key above


### Encrypting secrets
To run integration tests within a Travis build, you'll need to encrypt the file containing the
required external configuration properties.
For details on how to do this, please see
[this](https://github.com/IBM/ibm-cloud-sdk-common/blob/master/EncryptingSecrets.md)


## Setting the ``User-Agent`` Header In Preparation for SDK Metrics Gathering

If you plan to gather metrics for your SDK, the `User-Agent` header value must be
a string similar to the following:
   `my-java-sdk/0.0.1 (lang=java; java.vendor=AdoptOpenJDK; java.version=1.8.0_232; os.arch=x86_64; os.name=Linux; os.version=5.1)`

The key parts are the sdk name (`my-java-sdk`), version (`0.0.1`) and the
language name (`lang=java`).
This is required because the analytics data collector uses the User-Agent header included
with each request to gather usage data for IBM Cloud services.

The default implementation of the `SdkCommon.getSdkHeaders()` method provided in this SDK template
repository will need to be modified slightly for your SDK.
Replace the `my-java-sdk/0.0.1` part with the name and version of your
Java SDK. The rest of the system information should remain as-is.

For example, suppose your Java SDK project is called `platform-services-java-sdk` and its
version is `2.3.1`.
The `User-Agent` header value should be:
   `platform-services-java-sdk/2.3.1 (lang=java; java.vendor=AdoptOpenJDK; java.version=1.8.0_232; os.arch=x86_64; os.name=Linux; os.version=5.1)`

__Note__: It is very important that the sdk name ends with the string `-sdk`,
as the analytics data collector uses this to gather usage data.

More information about the analytics tool, and other steps you should take to start gathering
metrics for your SDK can be found [here](https://github.ibm.com/CloudEngineering/sdk-analytics).
