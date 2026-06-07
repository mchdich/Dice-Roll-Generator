# Program 2: Dice Roll Frequency Simulator

## Description
A Java program that simulates rolling two six-sided dice 1,000 times. The program records how often each possible sum (2–12) occurs and displays the results both numerically and as a text-based histogram.

## Files

### `Die.java`
Represents a single six-sided die.

**Responsibilities:**
- Stores the current face value.
- Provides getter and setter methods for the face value.
- Simulates a roll by generating a random number between 1 and 6.

### `Dice.java`
Represents a pair of dice.

**Responsibilities:**
- Creates and manages two `Die` objects.
- Rolls both dice simultaneously.
- Returns the sum of the two face values.

### `DiceTester.java`
Tests the dice simulation and displays results.

**Responsibilities:**
- Rolls two dice 1,000 times.
- Tracks the frequency of each possible sum (2–12).
- Prints the occurrence count for each sum.
- Generates a text-based histogram to visualize the distribution.

## Features
- Object-oriented design using separate classes for a die, a pair of dice, and the test driver.
- Simulates realistic dice roll probabilities.
- Records roll frequencies for statistical analysis.
- Displays results in an easy-to-read histogram.

## Output
- Frequency count for each dice sum from 2 to 12.
- Text-based histogram showing the distribution of results.

## Expected Results
Because two dice are rolled, sums near 7 should occur more frequently than sums near 2 or 12. The histogram should approximate a bell-shaped distribution as the number of rolls increases.