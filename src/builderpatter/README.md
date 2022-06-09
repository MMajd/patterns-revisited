## Builder Pattern Goal

### Separating the construction of a complex object from its reperesentation so that the same construction process can create different reperesentations

Most patterns seek to abstract away the logic from the data

Builder pattern, needs a director who knows how to apply the construction steps in the correct order
Builders should be data/persentation classes, the know what to do a each step but don't know the order of the steps,
the director takes care of this problem

DIRECTOR -> uses a BUILDER whose implemented by a CONCRETE BUILDER how knows what do at each stage of PRODUCT creation process

DIRECTOR

- puts the steps of creation in the right order

BUILDER

- interface defines the steps of creation
- holds an instance of the PRODUCT

CONCRETE BUILDER

- should be more than one, one for each variation of the product
- Provides implementation for interface defined by the Builder
- Knows what to do at each step _A recipe_

PRODUCT

- What's being built
- Not different type, but different data
- Different product variations, not necesserily means different types, could mean different data

There could be different types of products that have the same base class, but we should avoid this situation as our goal is to reduce the complexity not to add more complexity

**A VARIATIONS OF THIS PATTER THAT DOES NOT IMPLEMENT ALL PLAYERS** such as StringBuilder, that have the builder and product, but there's no director

**Problems leed to using build pattern**

- Too many parameters being set in the constructor
- Parameters are order dependent so using setters instead of initialization in the constructor may be harm the construction logic
- Different constructions

---
