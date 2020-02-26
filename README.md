

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


### Installation

1. Get a free API Key at [https://example.com](https://example.com)
2. Clone the repo
```sh
git clone https://github.com/your_username_/Project-Name.git
```
3. Install NPM packages
```sh
npm install
```
4. Enter your API in `config.js`
```JS
const API_KEY = 'ENTER YOUR API';
```


<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Mike Baird - [@your_twitter]https://www.linkedin.com/in/michael-baird-cfa-a02b881/) 

Use our website "contact us": [https://hoavalue.com)

