# Currency Converter

This project is a desktop Java application that allows users to convert U.S. dollars into various other currencies. It uses the ExchangeRate-API to obtain up-to-date exchange rates.

## Project Structure

The project is organized into the following packages and classes:

### Package `modelos`

- **ExchangeRateResponse**: Class that maps the JSON response from the ExchangeRate-API.
- **ExchangeRateConversion**: Class that extracts the `result` value from the `ExchangeRateResponse` object.
- **SolicitudHTTP**: Class that handles the HTTP request to the API and deserializes the JSON response.
- **VerificarInteger**: Class that checks if a string is an integer.
- **FrameMenu**: Class that creates and displays the main menu of the application.
- **FrameDinero**: Class that creates and displays the interface for entering the amount of dollars to convert.

### Package `main`

- **Main**: Main class that launches the application.

## Usage

### Requirements

- Java 8 or higher
- Internet connection

### Running the App

1. Clone the repository to your local machine.
2. Open the project in your favorite IDE (e.g., IntelliJ IDEA).
3. Run the `Main` class to start the application.

### Features

- **Main Menu**: Allows you to select the currency to convert dollars to.
- **Currency Conversion**: Lets you input an amount in dollars and displays the equivalent amount in the selected currency.
- **Exit**: Closes the application.

### Example Usage

1. Run the application.
2. Select an option from the menu to convert dollars to a specific currency.
3. Enter the amount in dollars to convert.
4. The application will display the equivalent amount in the selected currency.

This `README.md` provides an overview of the project, its structure, how to use it, and code examples. You can adjust it as needed to suit your specific needs.
