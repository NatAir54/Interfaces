# Interface

To create classes `Deposit` (bank account), `SpecialDeposit` (special deposit), `LongDeposit` (long-term deposit), `Client` (bank client) with set functionality.
To create abstract class `Deposit` and declare within it:
- Public money property only for reading `amount` (deposit amount)
- Public integer property only for reading `period` (time of deposit in months)
- Constructor (for calling in class-inheritor) with parameters `depositAmount` 
  and `depositPeriod`, which creates object deposit with specified sum 
  for specified period. The constructor must throw `IllegalArgumentException` 
  if `amount` or `period` is less or equal to 0.

To create interface `Prolongable` (prolonging deposit) and declare within 
it method `canToProlong` without parameters that returns logic value 
`true` or `false`, depending on the fact whether this specific deposit 
can be prolonged or not.

To implement interface `Prolongable` in classes `SpecialDeposit` and 
`LongDeposit`.  

In addition, special deposit (`SpecialDeposit`) can be prolonged only 
when more than 1000 UAH were deposited, and long-term deposit 
(`LongDeposit`) can be prolonged if the `period` of deposit 
is no longer than 3 years.

To implement standard generic interface `Comparable<Deposit>` in 
abstract class `Deposit`. Total sum amount (sum deposited plus interest 
during entire period) should be considered as comparison criteria 
of `Deposit` instances.

To create class Client (bank client) and declare within it:
- private field `deposits` (client deposits) – objects array 
of type Deposit
- constructor without parameters, which creates empty array 
deposits consisting of 10 elements
- method `addDeposit` with parameter `deposit` for adding 
special or long-term account into array on the 
first empty spot and returning true, or returning false, 
if accounts number limit is depleted (no empty space in array).

To implement additionally in class `Client`:
- interface `Iterable<Deposit>`:
  - method `iterator()` must return new instance of inner (nonstatic) class `Iterator<Deposit>`;
  - implements `hasNext()` and `next()` methods;
  - method `remove()` must throw `UnsupportedOperationException`.
- method `sortDeposits`, which performs deposits sorting in array deposits in
descending order of total sum amount on deposit upon deposit expiration.
- method `countPossibleToProlongDeposit`, which returns integer – amount
of current client’s deposits that can be prolonged.
