# CHAPTER SUMMARY
1. A variable is declared as an array type using the syntax elementType[] arrayRefVar or elementType arrayRefVar[]. The style elementType[] arrayRefVar is preferred, although elementType arrayRefVar[] is legal.
2. Unlike declarations for primitive data type variables, the declaration of an array variable does not allocate any space in memory for the array. An array variable is not a primitive data type variable. An array variable contains a reference to an array.
3. You cannot assign elements to an array unless it has already been created. You can create an array by using the new operator with the following syntax: new elementType[arraySize].
4. Each element in the array is represented using the syntax arrayRefVar[index]. An index must be an integer or an integer expression.
5. After an array is created, its size becomes permanent and can be obtained using arrayRefVar.length. Since the index of an array always begins with 0, the last index is always arrayRefVar.length - 1. An out-of-bounds error will occur if you attempt to reference elements beyond the bounds of an array.
6. Programmers often mistakenly reference the first element in an array with index 1, but it should be 0. This is called the index off-by-one error.
7. When an array is created, its elements are assigned the default value of 0 for the numeric primitive data types, \u0000 for char types, and false for boolean types.
8. Java has a shorthand notation, known as the array initializer, which combines declaring an array, creating an array, and initializing an array in one statement, using the syntax elementType[] arrayRefVar = {value0, value1, ..., valuek}.
9. When you pass an array argument to a method, you are actually passing the reference of the array; that is, the called method can modify the elements in the caller’s original array.
10. If an array is sorted, binary search is more efficient than linear search for finding an element in the array.
11. Selection sort finds the smallest number in the list and swaps it with the first element. It then finds the smallest number remaining and swaps it with the first element in the remaining list, and so on, until only a single number remains.
