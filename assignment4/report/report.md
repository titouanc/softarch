# Overview

In this assignment, we had to write transformations from a 
metamodel describing families in terms of member roles
(father, mother, sons, daughters) to a metamodel describing persons
in terms of their gender and the relations to other persons.

These transformations have been written in the ATLAS Transformation Language (ATL), using the Eclipse Modelling tools.


# Transforming families

Both the original and the target metamodel define families.
Our first transformation rule transforms Families from the original metamodel to their equivalent in the target metamodel. This transformation copies the last name of the family, then count the number of children in the family and store it as `noOfChildren` attribute, and count the number of parents and set the `isSingleParent` to true if there is only one parent.

## Counting members
In order to compute the 2 derived attributes described in the above paragraph, we define a helper function on Member (from the original Families metamodel): `isChild` which returns true if the member is a son or a daughter. It is a parent otherwise. We then filter the set of members of a family with this predicate and retrieve its size to compute the derived attributes values.

# Transforming members

We then transform the Family Members to Persons. We wrote an abstract rule `Member2Person` to do so, which convey the first name and the family of a `Member` to a Person. Then, this rule is specialised into 4 different concrete rules: `Member2Father`, `Member2Mother`, `Member2Son` and `Member2Daughter`. Each of these rules is only applicable to the kind of family member it should translate. In order to make the scope of the rule more clear, we also define the `isFemale` helper predicate on the Member entity.
