# Command Pattern 

## Intent
Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

**Type**

- Behavioral
- GOF 

**Traits**

- Represent an action as an object
- Decouple clients execute the command from the details and dependencies of the command logic
- Enables delayed execution
- Can queue commands for later execution
- If command objects are also persistent, can be delay across process restart
- Commands must be completely self-contained
- Easy to add new commands

- open closed principle

**Also known as**

- Action
- Transaction

**Can have operations besides execution operation such as**

- Logging
- Validation
- Undo

**Related Patterns**

- Factory, can be used to create commands
- Composite, can be used to create composite commands from other commands
- Null objects, can be used to represent non-existent commands instead of returning null
