# Flow NBT [![License](http://img.shields.io/badge/license-MIT-lightgrey.svg?style=flat)][License] [![Flattr this](http://img.shields.io/badge/flattr-donate-lightgrey.svg?style=flat)][Donate] [![Build Status](http://img.shields.io/travis/flow/nbt/develop.svg?style=flat)](https://travis-ci.org/flow/nbt) [![Coverage Status](http://img.shields.io/coveralls/flow/nbt/develop.svg?style=flat)](https://coveralls.io/r/flow/nbt)

Named Binary Tag (NBT) library for Java based on Graham Edgecombe's JNBT library. NBT is a tag based binary format designed to carry large amounts of binary data with smaller amounts of additional data.

## Getting Started
* [Official documentation](#documentation)
* [Issues tracker](https://github.com/divinecraft/nbt/issues)

## Source Code
The latest and greatest source can be found here on [GitHub](https://github.com/divinecraft/nbt). If you are using Git, 
use this command to clone the project:

```bash
git clone git://github.com/divinecraft/nbt.git
```

## Contributing
Are you a talented programmer looking to contribute some code? We'd love the help!

* Open a pull request with your changes, following our [guidelines and coding standards](CONTRIBUTING.md).
* Please follow the above guidelines for your pull request(s) accepted.
* For help setting up the project, keep reading!

Love the project? Feel free to [donate] to help continue development! Flow projects are open-source and powered by community members, like yourself. Without you, we wouldn't be here today!

Don't forget to watch and star our repo to keep up-to-date with the latest Flow development!

## Usage
If you're using [Maven](https://maven.apache.org/download.html) to manage project dependencies, simply include the following in your `pom.xml` file:

```xml
<dependency>
    <groupId>ru.divinecraft</groupId>
    <artifactId>flow-nbt</artifactId>
    <version>1.0.2-SNAPSHOT</version>
</dependency>
```

If you're using [Gradle](https://www.gradle.org/) to manage project dependencies, simply include the following in your `build.gradle` file:

```groovy
repositories {
    mavenCentral()
}
dependencies {
    compile 'com.flowpowered:flow-nbt:1.0.1-SNAPSHOT'
}
```

If you plan on using snapshots and do not already have the snapshot repo in your repository list, you will need to add this as well:

```text
https://oss.sonatype.org/content/groups/public/
```

## Documentation

To generate Javadocs use the `mvn javadoc:javadoc` command. To view the Javadocs simply go to `target/site/apidocs/` and open `index.html` in a web browser.

## Legal Stuff
Flow NBT is licensed under the [MIT License][License]. Basically, you can do whatever you want as long as you include the original copyright. Please see the `LICENSE.txt` file for details.

## Credits
* [Spout](https://spout.org/) and contributors - *where we all began, and for much of the re-licensed code.*
* All the people behind [Java](http://www.oracle.com/technetwork/java/index.html)
  and [Maven](https://maven.apache.org/).

[License]: https://tldrlegal.com/l/mit
