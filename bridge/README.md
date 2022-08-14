# bridge Pattern Goal 
## Intent
Decoupling the abstraction (ex: Manuscript) and it's implementation (ex: Book, AcademiaPaper) so that the two can vary independentaly

**Type** 

- Structural 
- GOF 

**Participants**

- Abstraction
- bridge, Unification of api and OS specific UI implementation
- Implementation, Client code uses these bridge to draw different widgets

**Applicability**

Use the bridge pattern when

- You want to avoid a permanent binding between an abstraction and its implementation. This might be the case, for example, when the implementation must be selected or switched at run-time.
- Both the abstractions and their implementations should be extensible by subclassing. In this case, the bridge pattern lets you combine the different abstractions and implementations and extend them independently.
- Changes in the implementation of an abstraction should have no impact on clients; that is, their code should not have to be recompiled.
- You have a proliferation of classes. Such a class hierarchy indicates the need for splitting an object into two parts. Rumbaugh uses the term "nested generalizations" to refer to such class hierarchies.
- You want to share an implementation among multiple objects (perhaps using reference counting), and this fact should be hidden from the client. A simple example is Coplien's String class, in which multiple objects can share the same string representation.


**Examples**

- User Interface
  - Abstract: Shape abstract definition
  - bridge: that unify api and implement OS specific implementation  
  - Implementation: Code that draws different widgets
- Persistence
  - Object persistence 
  - Persistence type (Database, file, streaming of the network)
