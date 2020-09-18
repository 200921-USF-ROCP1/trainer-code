# ROCP Phase 1 
## Getting Started

Hello and welcome! In this guide you will find information on the tools we will be using throughout this foray into Java, which will culminate in your taking the [Oracle Java Foundations exam](https://education.oracle.com/java-foundations/pexam_1Z0-811).

## Tools

### Java
To get Java for development, you must first visit Orcle's website and install the JDK. We will focus on Java 8, but feel free to install the most recent form of Java as well. Some things may be different than what we will discuss, but that can only be healthy discussion!
[Java 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
[Java 15 (latest)](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html)

You may also need to add the JDK to your PATH environment variable. Please visit one of the following sources for a quick explanation:
[Java SE 15 Install Guide (will help wit 8 too)](https://docs.oracle.com/en/java/javase/15/install/installation-jdk-microsoft-windows-platforms.html#GUID-96EB3876-8C7A-4A25-9F3A-A2983FEC016A)
[Alt Source 1](https://www.poftut.com/how-to-set-java-jre-and-jdk-home-path-and-environment-variables-on-windows/)
[Alt Source 2](https://kingluddite.com/tools/how-do-i-add-java-to-my-windows-path)

You will know the JDK is installed and configured properly if you can run the following command successfully in your terminal (e.g. cmd on Windows):
```
java -version
```

For Java, I will be using [Spring Tools 4 for Eclipse](https://spring.io/tools), a specilized form of Eclipse. If you prefer, you may use whatever IDE you are most comfortable with. Some other popular IDEs include  [IntelliJ IDEA](https://www.jetbrains.com/idea/) and [Eclipse](https://www.eclipse.org/ide/) itself. Note that IntelliJ IDEA may provide some extra challenges when it comes to servlets (the third week).

Once you have the JDK and an IDE, you have the basics!

## DBeaver
DBeaver is database management software that I will be using for interacting with and modifying a remote database starting Week 2. You will want to download and install this, but you don't need to do anything else with it yet.

[Get it here.](https://dbeaver.io/)

### Tomcat
Apache Tomcat 9 is a web server that we will be using to test our very own server software that we will build in Week 3. When you download it, you will get a compressed file. You only need to uncompress this file somewhere and remember where that is; come Week 3, I will discuss configuring Spring Tools 4 to host a web server via Tomcat.

[Get it here.](https://tomcat.apache.org/download-90.cgi)