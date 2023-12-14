# Java Application to remove duplicate characters from String

This is a simple command-line java application that takes a string as an input, removes duplicate characters, and prints the result.

NB: Does not work with strings containing spaces between words. Will remove duplicates only from the first word.

## Requirements
- Java 11 or later versions.
- Gradle (Preferably through use of gradlew script included in the project)

## Compile & Run

After navigating to the project directory in a terminal, the application can be compiled and run:

### For Mac/Linux:

Use the gradlew script to run the application:

Please replace `"AABBCCD112233"` with the string you want to remove duplicates from. 

Example:
`./gradlew run --args "AABBCCD112233"`

### For Windows:

Use the gradle.bat script to run the application:
