# Connect4 and TicTacToe Java Games

This Java project provides implementations of two classic board games: Connect4 and TicTacToe. These games are designed to be played through RESTful web services, making it easy to integrate them into other applications or create web-based game interfaces.

## Features

### Connect4

- **Connect4Service**: A service for analyzing Connect4 game states and determining the winner. It supports horizontal, vertical, and diagonal win conditions.
- **Connect4Controller**: A RESTful API controller for Connect4 games, allowing you to check for winners by providing the game state as input.

### TicTacToe

- **TicTacToeService**: A service for analyzing TicTacToe game states and determining the winner. It supports horizontal, vertical, and diagonal win conditions.
- **TicTacToeController**: A RESTful API controller for TicTacToe games, allowing you to check for winners by providing the game state as input.

## Project Structure

The project follows a structured layout:

- **model**: Contains classes representing the game state and winner status.
- **controller**: Provides RESTful API endpoints to interact with the games.
- **services**: Implements the game logic and winner-checking services.



## Getting Started

To run the application, follow these steps:

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/kristinkor/connect4.git
   
2. Navigate to the project directory:
   ```bash
   cd connect4
   
3. Build the project using Maven:
   ```bash
   mvn clean install
   
4. Run the application:
    ```bash
    java -jar target/the-game-korzhenevskaya.kristina-1.0.jar


Access the application in your web browser:

Connect4: http://localhost:8080/game/connect4

Tic Tac Toe: http://localhost:8080/game/tictactoe



## Example Tests

The project includes comprehensive unit tests to ensure the correctness of the game logic and winner-checking services. Here's an example of a unit test from the Connect4 game:

```java
@Test
@DisplayName("Test horizontal top left")
void T1_GetWinnerHorizontal() {
    // Test code and assertions
}
// ... (Other test methods)
