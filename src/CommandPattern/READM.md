## Command Pattern

Repersent an action as an object
Decouple clients execute the command from the details and dependencies of the command logic
Enables delayed execution

- Can queue commands for later execution
- If command objects are also presisent, can be delay across process restart

Commands must be completely self-contained
Easy to add new commands

- open closed principle

Also know as

- **Action**
- **Transaction**

Can have operations besides execution operation such as

- Logging
- Validation
- Undo

**Related Patterns**

- Factory, can be used to create commands
- Composite, can be used to create composite commands from other commmands
- Null objects, can be used to reperenset non-existant commands instead of returning null
