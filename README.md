# 🎬 Cinema Management System (CMS)

## 📌 Overview
The **Cinema Management System (CMS)** is a software project developed for **ITSE305 – Software Engineering Project**. The system provides an interface for users to browse movies, make bookings, and manage accounts, while also supporting administrative functions like movie management and report generation.

## 🏆 Team Members
| **Name**               | **ID**      | **GitHub Account**    |
|------------------------|-------------|-----------------------|
| **Israa Alwedaei**     | 202204345   | i149a                 |
| **Malak Zakareya**     | 202208286   | MalakZakareya         |
| **Manar Alshaikh**     | 202208628   | manar-alshaikh        |
| **Zahraa Fadhel**      | 202209444   | ZahraaFadhel          |

## ⚙️ JUnit Setup
JUnit is used for unit testing in this project. Follow these steps to set it up:

### 1. **Download JUnit**
- Download `junit.jar` from [JUnit official site](https://junit.org/)
- Place it inside the `lib/` folder in your project directory

### 2. **Install 'Test Runner for Java' extension by Microsoft**
- In VS code ensure 'Test Runner for Java' extension is installed
- You will notice a new tab called testing in the side menu

### 3. **Run Tests**
- Run tests for each class or whole classes by clicking start button

## ⚖️ Randoop Setup
Randoop is used for automated test generation. Follow these steps to set it up:

### 1. **Download Randoop**
- Download `randoop-all-4.3.3.jar` from [Randoop official site](https://randoop.github.io/randoop/)
- Place it inside the `lib/` folder in your project directory
- Alternatively, set its path in your environmenmt variables

### 2. **Generate Tests Using Randoop**
Run the following command to generate JUnit test cases:

- Create .class files by running:
```sh
javac -d bin src\primaryUseCases\browseMovies\*.java
```

- then generate test cases inside a  foldercalled generated-tests by running:
```sh
java java -classpath "bin;C:\randoop-4.3.3\randoop-all-4.3.3.jar" randoop.main.Main gentests --testclass src.primaryUseCases.browseMovies.browseMoviesDataLayer --junit-output-dir generated-tests
```

### 3. **Run Generated Tests**
After generating test files, compile and run them as usual JUnit test classes 🎉!

