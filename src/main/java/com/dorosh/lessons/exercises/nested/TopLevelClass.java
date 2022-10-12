package com.dorosh.lessons.exercises.nested;

public class TopLevelClass {

    void accessMembers(OuterClass outer) {
        // Compiler error: Cannot make a static reference to the non-static
        //     field OuterClass.outerField
        // System.out.println(OuterClass.outerField);
        System.out.println(outer.outerField);
        System.out.println(OuterClass.staticOuterField);

        class LocalClassExample{

        }

        LocalClassExample localClassExample = new LocalClassExample();
    }

    public static void main(String[] args) {
        TopLevelClass topLevelClass = new TopLevelClass();
    }
}
