# Bennu Security Policies and Procedures

This document outlines security procedures and general policies for the
Bennu Open Source projects as found on [https://github.com/bennu/mybatis-commons](https://github.com/bennu/mybatis-commons).

* [Reporting a Vulnerability](#reporting-a-vulnerability)
* [Disclosure Policy](#disclosure-policy)

## Reporting a Vulnerability

Bennu team and community take all security vulnerabilities seriously. 
Thank you for improving the security of our open source software.
We appreciate your efforts and responsible disclosure and will make every effort 
to acknowledge your contributions.

Report security vulnerabilities by using the github security reporting mechanism:
* https://github.com/bennu/mybatis-commons/security
* -> "Private vulnerability reporting"
* -> "Report a vulnerability"

The lead maintainer will acknowledge your report within 24 hours, and will
send a more detailed response within 48 hours indicating the next steps in
handling your report. After the initial reply to your report, the security
team will endeavor to keep you informed of the progress towards a fix and
full announcement, and may ask for additional information or guidance.

Report security vulnerabilities in third-party modules to the person or
team maintaining the module.

## Disclosure Policy

When the security team receives a security bug report, they will assign it
to a primary handler. This person will coordinate the fix and release
process, involving the following steps:

* Confirm the problem and determine the affected versions.
* Audit code to find any potential similar problems.
* Prepare fixes for all releases still under maintenance. These fixes
  will be released as fast as possible to NPM.