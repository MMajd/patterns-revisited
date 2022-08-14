# Chain of Responsibility Pattern 

## Intent
Decoupling the sender of a message from the receiver, 
In nutshell chain of responsibility is an ordered list of message handlers that know how to do two things

- Process specific type of message, or
- Pass the message along to the next message handler in the chain

**Type** 

- Behavioral 
- GOF 

**Traits**

- The senders are aware of only one receiver
- Each receiver is only aware of the next receiver
- Receiver process the message or sent it down the chain
- Sender does not know who received the message
- The first receiver to handle the message terminate the chain
- The order of the receiver list matters

**Participants**

- Client code
- Abstract message handler
- Concrete message handlers

**When to use**

- More than one message handler for a message
- The appropriate handler is not explicitly known by the sender
- The set of handlers can be dynamically defined

**NOTE: at the end of the chain we could implement null object pattern to always deny the request instead of thrownig an error**
