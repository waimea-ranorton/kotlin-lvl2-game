# Plan for Testing the Program

The test plan lays out the actions and data I will use to test the functionality of my program.

Terminology:

- **VALID** data values are those that the program expects
- **BOUNDARY** data values are at the limits of the valid range
- **INVALID** data values are those that the program should reject

---

## Testing "see rules"

I will test if users can say yes to seeing game rules before playing

### Test Data To Use

I will imput "Y" for yes

### Expected Test Result

I expect to see the game rules show on screen and then the game proceads

---

## Testing "see rules"

I will test if users can skip seeing game rules before playing

### Test Data To Use

I will press enter

### Expected Test Result

I expect to see the game skip the rules and procead

---

## Testing player names

I will test the entering user names

### Test Data To Use

I will insert the names Bob and NotBob

### Expected Test Result

I expect I will be able to enter both player names, then the game calls the players by them thoughout
---

## Testing player moves

Testing player ones first move

### Test Data To Use

I will try to input 1

### Expected Test Result

I expect a counter to appear on the 1st box

---

## Testing player moves

Testing player ones first move

### Test Data To Use

I will try to input 5

### Expected Test Result

I expect a counter to appear on the 5th box

---

## Testing player moves

Testing player ones first move

### Test Data To Use

I will try to input 12

### Expected Test Result

I expect a counter to appear on the 12th box

---

## Testing player moves

Testing player twos first move

### Test Data To Use

I will try to input 1

### Expected Test Result

I expect a counter to appear on the 1st box

---

## Testing player moves

Testing player twos first move

### Test Data To Use

I will try to input 5

### Expected Test Result

I expect a counter to appear on the 5th box

---

## Testing player moves

Testing player twos first move

### Test Data To Use

I will try to input 12

### Expected Test Result

I expect a counter to appear on the 12th box

---

## Testing bomb

Testing to see what happens when player 1 places three counters in a row

### Test Data To Use

I will place three counters in a row

### Expected Test Result

I expect the counters to be removed from the board, the player will be shown they have 3 points, and the message "BOOM!!!" to be displayed

---

## Testing bomb

Testing to see what happens when player 2 places three counters in a row

### Test Data To Use

I will place three counters in a row

### Expected Test Result

I expect the counters to be removed from the board, the player will be shown they have 3 points, and the message "BOOM!!!" to be displayed

---

## Player win

Testing what happens when player 1 wins

### Test Data To Use

I will get player 1 to 10 points

### Expected Test Result

I expect the players to get told one player 1 won, the points to be shown, and the game to end

---


