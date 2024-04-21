<p align="center">
  <img src="https://cdn-icons-png.flaticon.com/512/6295/6295417.png" width="100" />
</p>
<p align="center">
    <h1 align="center">A10 Calculator</h1>
</p>
<p align="center">
    <em>Kalkulator Simple dalam bahasa java guna mempelajari automation testing</em>
</p>
<p align="center">
	<img src="https://img.shields.io/github/license/RaditPasya/ppl-calculator-unit-testing?style=flat&color=0080ff" alt="license">
	<img src="https://img.shields.io/github/last-commit/RaditPasya/ppl-calculator-unit-testing?style=flat&logo=git&logoColor=white&color=0080ff" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/RaditPasya/ppl-calculator-unit-testing?style=flat&color=0080ff" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/RaditPasya/ppl-calculator-unit-testing?style=flat&color=0080ff" alt="repo-language-count">
<p>
<p align="center">
		<em>Developed with the software and tools below.</em>
</p>
<p align="center">
	<img src="https://img.shields.io/badge/Gradle-02303A.svg?style=flat&logo=Gradle&logoColor=white" alt="Gradle">
	<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white" alt="java">
	<img src="https://img.shields.io/badge/JetBrains-000000.svg?style=flat&logo=JetBrains&logoColor=white" alt="JetBrains">
</p>
<hr>

## Calculator App

Calculator ini merupakan aplikasi calculator simple yang ditulis dalam bahasa java yang memiliki fungsi menerima 2 integer dan satu char berupa operator dan melakukan kalkulasi matematis berdasarkan input user.

Aplikasi ini terdiri dari 3 bagian penting, Computation Module, Validator Module dan MainApp

---

##  Repository Structure

```sh
└── ppl-calculator-unit-testing/
    ├── LICENSE
    ├── README.md
    ├── build.gradle
    ├── gradle
    │   └── wrapper
    │       ├── gradle-wrapper.jar
    │       └── gradle-wrapper.properties
    ├── gradlew
    ├── gradlew.bat
    ├── settings.gradle
    └── src
        ├── main
        │   └── java
        │       ├── Computation.class
        │       ├── Computation.java
        │       ├── ConsoleInputOutput.java
        │       ├── Input.class
        │       ├── Input.java
        │       ├── InputOutput.java
        │       ├── MainApp.class
        │       ├── MainApp.java
        │       ├── Validator.class
        │       └── Validator.java
        └── test
            └── java
                ├── ComputationTest.java
                └── ValidationTest.java
```

---

##  Modules

<details open><summary>.</summary>

| File                                                                                                     | Summary                                     |
| ---                                                                                                      | ---                                         |
| [settings.gradle](https://github.com/RaditPasya/ppl-calculator-unit-testing/blob/master/settings.gradle) | Settings untuk gradle `settings.gradle` |
| [build.gradle](https://github.com/RaditPasya/ppl-calculator-unit-testing/blob/master/build.gradle)       | Gradle build properties `build.gradle`    |
| [gradlew.bat](https://github.com/RaditPasya/ppl-calculator-unit-testing/blob/master/gradlew.bat)         | Gradle bat script `gradlew.bat`     |

</details>

<details open><summary>src.main.java</summary>

| File                                                                                                                                   | Summary                                                           |
| ---                                                                                                                                    | ---                                                               |
| [Input.java](https://github.com/RaditPasya/ppl-calculator-unit-testing/blob/master/src/main/java/Input.java)                           | Menangani Input dari User dengan menggunakan scanner `src/main/java/Input.java`              |
| [Computation.java](https://github.com/RaditPasya/ppl-calculator-unit-testing/blob/master/src/main/java/Computation.java)               | Module yang menangani komputasi matematika `src/main/java/Computation.java`        |
| [InputOutput.java](https://github.com/RaditPasya/ppl-calculator-unit-testing/blob/master/src/main/java/InputOutput.java)               | Menangani Input dari User [deprecated]  `src/main/java/InputOutput.java`        |
| [Validator.java](https://github.com/RaditPasya/ppl-calculator-unit-testing/blob/master/src/main/java/Validator.java)                   | Module menangani proses validasi input sebelum dilakukan komputasi matematika `src/main/java/Validator.java`          |
| [ConsoleInputOutput.java](https://github.com/RaditPasya/ppl-calculator-unit-testing/blob/master/src/main/java/ConsoleInputOutput.java) | Menangani Input dari User [deprecated] `src/main/java/ConsoleInputOutput.java` |
| [MainApp.java](https://github.com/RaditPasya/ppl-calculator-unit-testing/blob/master/src/main/java/MainApp.java)                       | Main App dari aplikasi kalkulator ini `src/main/java/MainApp.java`            |

</details>

<details open><summary>src.test.java</summary>

| File                                                                                                                             | Summary                                                        |
| ---                                                                                                                              | ---                                                            |
| [ValidationTest.java](https://github.com/RaditPasya/ppl-calculator-unit-testing/blob/master/src/test/java/ValidationTest.java)   | HTTP pengujian (unit test) untuk kelas Validator, yang menguji berbagai metode validasi input, termasuk pengecekan apakah input berupa bilangan bulat, apakah input berada dalam rentang yang valid, dan apakah operator matematika yang dimasukkan valid.  `src/test/java/ValidationTest.java`  |
| [ComputationTest.java](https://github.com/RaditPasya/ppl-calculator-unit-testing/blob/master/src/test/java/ComputationTest.java) | HTTP kelas pengujian (unit test) untuk sebuah kelas Computation yang menguji fungsi-fungsi perhitungan seperti penambahan, pengurangan, perkalian, dan pembagian `src/test/java/ComputationTest.java` |

</details>

###  Building ppl-calculator-unit-testing

Command untuk build:

```sh
./gradleew build
```

###  Tests

Command untuk test:

```sh
./gradlew test
```

---

##  License

This project is protected under the [GPL-3](https://choosealicense.com/licenses) License.

---

##  Acknowledgments

- Hanri Fajar Ramadhan - Programmer, Tester
- Raditya Pasya Heryandi - Programmer, Tester