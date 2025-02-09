grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    legacyResolve false // whether to do a secondary resolve on plugin installation, not advised and here for backwards compatibility
    repositories {
        /* grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()*/

        //mavenRepo "https://oosnmp.net/dist/release/"
        mavenRepo "https://repo1.maven.org/maven2/"
        mavenRepo "http://repo.grails.org/grails/plugins"
        mavenRepo "https://repository.springsource.com/maven/bundles/external"

        // uncomment the stuff below to enable remote dependency resolution
        // from public Maven repositories
//        mavenLocal()
//        mavenRepo "http://snapshots.repository.codehaus.org"
//        mavenRepo "http://repository.codehaus.org"
//        mavenRepo "http://download.java.net/maven/2/"
//        mavenRepo "http://repository.jboss.com/maven2/"

    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        runtime 'mysql:mysql-connector-java:5.1.21'
    }

    plugins {
        runtime ":hibernate:$grailsVersion"
        build ":tomcat:$grailsVersion"

        // This command was necessary for me, so I could work locally with my plugin - David S.
        build ':release:2.2.1', ':rest-client-builder:1.0.3', {
            export = false
        }

        compile "org.grails.plugins:jquery:1.11.1"
        //runtime ':twitter-bootstrap:3.3.4'
    }
}
