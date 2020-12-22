[![Build Status](https://travis-ci.com/IBM/networking-java-sdk.svg?branch=master)](https://travis-ci.com/IBM/networking-java-sdk)
[![Javadoc](https://img.shields.io/static/v1?label=javadoc&message=latest&color=blue)](https://ibm.github.io/networking-java-sdk/docs/latest)
[![Release](https://img.shields.io/github/v/release/IBM/networking-java-sdk)](https://github.com/IBM/networking-java-sdk/releases/latest)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![codecov](https://codecov.io/gh/IBM/networking-java-sdk/branch/master/graph/badge.svg)](https://codecov.io/gh/IBM/networking-java-sdk)
[![semantic-release](https://img.shields.io/badge/%20%20%F0%9F%93%A6%F0%9F%9A%80-semantic--release-e10079.svg)](https://github.com/semantic-release/semantic-release)

# IBM Cloud Networking Services Java SDK Version 0.14.0
Java client library to interact with various [IBM Cloud Networking Services](https://cloud.ibm.com/apidocs?category=networking).

Disclaimer: this SDK is being released initially as a **pre-release** version.
Changes might occur which impact applications that use this SDK.

## Table of Contents

<!--
  The TOC below is generated using the `markdown-toc` node package.

      https://github.com/jonschlinkert/markdown-toc

  You should regenerate the TOC after making changes to this file.

      npx markdown-toc --maxdepth 4 -i README.md
  -->

<!-- toc -->

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Using the SDK](#using-the-sdk)
- [Questions](#questions)
- [Issues](#issues)
- [Open source @ IBM](#open-source--ibm)
- [Contributing](#contributing)
- [License](#license)

<!-- tocstop -->

## Overview

The IBM Cloud Network Services Java SDK allows developers to programmatically interact with the following IBM Cloud services:

Service Name | Artifact Coordinates
--- | --- 
[Transit Gateway ](https://cloud.ibm.com/docs/transit-gateway) | com.ibm.cloud:transit-gateway-apis:0.14.0
[Direct Link](https://cloud.ibm.com/apidocs/direct_link?code=java) | com.ibm.cloud:direct-link:0.14.0
[Direct Link Provider](https://cloud.ibm.com/apidocs/direct_link_provider_api?code=java) | com.ibm.cloud:direct-link-provider:0.14.0
## Prerequisites

[ibm-cloud-onboarding]: https://cloud.ibm.com/registration

* An [IBM Cloud][ibm-cloud-onboarding] account.
* An IAM API key to allow the SDK to access your account. Create one [here](https://cloud.ibm.com/iam/apikeys).
* Java 8 or above.

## Installation
The current version of this SDK is: 0.14.0

Each service's artifact coordinates are listed in the table above.

The project artifacts are published on the following public maven repositories:
- [JCenter](https://bintray.com/bintray/jcenter) - For information on how to use the
public JCenter maven repository, open [this link](https://bintray.com/bintray/jcenter)
then click the `Set Me Up!` button.
- [Maven Central](https://repo1.maven.org/maven2/) - This is the default public repository
used by maven when searching for dependencies.  To use this repository within your
gradle build, please see
[this link](https://docs.gradle.org/current/userguide/declaring_repositories.html).

To use a particular service, define a dependency that contains the
artifact coordinates (group id, artifact id and version) for the service, like this:

##### Maven

```xml
<dependency>
    <groupId>com.ibm.cloud</groupId>
    <artifactId>transit-gateway-apis</artifactId>
    <version>0.14.0</version>
</dependency>
<dependency>
    <groupId>com.ibm.cloud</groupId>
    <artifactId>direct-link</artifactId>
    <version>0.14.0</version>
</dependency>
<dependency>
    <groupId>com.ibm.cloud</groupId>
    <artifactId>direct-link-provider</artifactId>
    <version>0.14.0</version>
</dependency>
```

## Using the SDK
For general SDK usage information, please see [this link](https://github.com/IBM/ibm-cloud-sdk-common/blob/master/README.md)

## Questions

If you are having difficulties using this SDK or have a question about the IBM Cloud services,
please ask a question at
[Stack Overflow](http://stackoverflow.com/questions/ask?tags=ibm-cloud).

## Issues
If you encounter an issue with the project, you are welcome to submit a
[bug report](https://github.com/IBM/networking-java-sdk/issues).
Before that, please search for similar issues. It's possible that someone has already reported the problem.

## Open source @ IBM
Find more open source projects on the [IBM Github Page](http://ibm.github.io/)

## Contributing
See [CONTRIBUTING](CONTRIBUTING.md).

## License

The IBM Cloud MySDK Java SDK is released under the Apache 2.0 license.
The license's full text can be found in [LICENSE](LICENSE).
