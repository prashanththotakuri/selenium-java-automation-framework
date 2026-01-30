<!-- ===== BADGES ===== -->

<!-- Option A: Simple badge (never breaks) -->
![Build](https://img.shields.io/badge/build-passing-brightgreen)

<!-- Option B: GitHub Actions badge (delete Option A if using this)
[![Build](https://github.com/prashanththotakuri/selenium-java-automation-framework/actions/workflows/WORKFLOW_FILE.yml/badge.svg)](https://github.com/prashanththotakuri/selenium-java-automation-framework/actions/workflows/WORKFLOW_FILE.yml)
-->

![Java](https://img.shields.io/badge/Java-17-blue)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-brightgreen)
![TestNG](https://img.shields.io/badge/TestNG-Framework-orange)
![CI](https://img.shields.io/badge/CI-GitHub%20Actions-black)

# Selenium Java Automation Framework

Enterprise-grade Selenium automation framework built using **Java**, **TestNG**, **Maven**, and **Page Object Model (POM)**.  
Designed to reflect real-world QA automation used in large-scale enterprise applications.

---

## 🚀 Key Features
- Page Object Model (POM) design
- TestNG test execution
- Maven dependency management
- Cross-browser support
- Reusable utilities and base classes
- CI-ready structure (GitHub Actions / Jenkins)
- Scalable and maintainable code

---

## 🛠 Tech Stack
```text
Language   : Java
Automation : Selenium WebDriver
Framework  : TestNG
Build Tool : Maven
Design     : Page Object Model (POM)
CI/CD      : GitHub Actions / Jenkins
selenium-java-automation-framework
│
├── src
│   ├── main
│   │   └── java
│   │       ├── base        (Driver setup, base test)
│   │       ├── pages       (Page classes)
│   │       └── utils       (Utilities, config readers)
│   │
│   └── test
│       └── java
│           └── tests       (Test cases)
│
├── pom.xml
├── testng.xml
└── README.md
