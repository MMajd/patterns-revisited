## Chain of Responsibility Pattern

Decoupling the sender of a message from the reciever

In nutshell chain of responsibility is an ordered list of message handlers that know how to do two things

- Process specific type of message, or
- Pass the message along to the next message handler in the chain

Pattern traits

- The senders is aware of only one reciever
- Each reciever is only aware of the next reciever
- Reciever process the message or sent it down the chain
- Sender does not know who recieved the message
- The first reciever to handle the message terminate the chain
- The order of the reciever list matters

Participants

- Client code
- Abstract message handler
- Concrete message handlers

When to use

- More than one message handler for a message
- The appropriate handler is not explicitly known by the sender
- The set of handlers can by dyamically defined

**NOTE: At the end of the chain we could implement null object pattern to always deny the request instead of thrownig an error**
