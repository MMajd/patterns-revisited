
## Bridge Pattern Goal

Decoupling the abstraction (ex: Manuscript) and it's implementation (ex: Book, AcademiaPaper) so that the two can vary independentaly

**Participants**

- Abstraction
- Bridge, Unification of api and OS specific UI implementation 
- Implementation, Client code uses these bridge to draw different widgets

**Examples**

- User Interface
  - Abstract: Shape abstract definition
  - Bridge: that unify api and implement OS specific implementation  
  - Implementation: Code that draws different widgets
- Persistence
  - Object persistence 
  - Persistence type (Database, file, streaming of the network)
