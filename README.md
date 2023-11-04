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

## Example Tests

The project includes comprehensive unit tests to ensure the correctness of the game logic and winner-checking services. Here's an example of a unit test from the Connect4 game:

```java
@Test
@DisplayName("Test horizontal top left")
void T1_GetWinnerHorizontal() {
    // Test code and assertions
}
// ... (Other test methods)
