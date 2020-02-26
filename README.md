

<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://hoavalue.com">
    <img src="src/readme/HOA-Value-Logo-xSmall.gif" alt="Logo" width="600" height="118">
  </a>

  <h3 align="center">Improving the lives of residents in homeowner assocations (HOAs) through analytics</h3>

</p>


## Table of Contents

- [Our Mission](#our-mission)
- [About the Project](#about-the-project)
- [Getting Started](#getting-started)
	- [Prerequisites](#prerequisites)
	- [Installation](#installation)
- [License](#license)
- [Contact](#contact)



<!-- Our Mission -->
## Our Mission
**Use analytics to improve the lives of homeowners**

We are free-open source software that anyone cna use or contribute to.  

Over 30 million people live in homeowner assocations (HOAs) and they are typically governed by volunteer board members.  These volunteers are responsible for setting budgets that ensure residents don't get stuck with special assessments. We collect, analyze, and visualize the data so these volunteers can catch possible issues with their budgets.  

We bring HOAs together to share data, ideas, and lessons learned.  

If you have an awesome idea for a feature, please fork the repo and create a pull request or simply open an issue with the tag "enhancement".


<!-- ABOUT THE PROJECT -->
## About The Project

This project spring boot restful APIs using OAS 3 (spring-doc), Docker with openjdk:alpine, and oAuth2

This API stores data to a MySql database using JPA and JDBC.  The data includes HOA details (name, address, year built) and the financial details (reserve components, fees charged, etc).  We utilize this data to compare to other HOAs proving owners, board volunteers, and property managers with transparency into areas they can improve their operations.


Here is a screenshot of our API:
![Image](src/readme/oas-screenshot.gif?raw=true)

This project is just the api used for CRUD operations.  The website/UI is an located [here](https://github.com/huggybaird/hoa-dashboard).

<!-- GETTING STARTED -->
## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.

### Prerequisites
1. JDK 1.8 [here](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
2. Spring Boot knowledge. see [getting started](https://spring.io/guides/gs/spring-boot/)
3. Docker Desktop [here](https://www.docker.com/)
4. Git Bash [here](https://gitforwindows.org/)
5. MySQL [here](https://www.mysql.com/)
6. Your favorite IDE. I use [eclipse](https://www.eclipse.org/), but feel free to get jiggy with VS Code or Intellij. have fun!

OPTIONAL: grab the UI/website that uses this api [here](https://github.com/huggybaird/hoa-dashboard)

### Installation

1. Clone the repo
```sh
git clone https://github.com/huggybaird/hoa-value-boot.git
```
2. Install the MySQL DDL scripts to create the database. The scripts are in the /src/database/* directory
3. Rename /src/main/resources/application.properties.example to application.properties
	a. Change the application.properties so it points to your MySQL connection. you'll need a user/password


<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Mike Baird - [@LinkedIn]{https://www.linkedin.com/in/michael-baird-cfa-a02b881/) 

Use our website "contact us": [https://hoavalue.com)

