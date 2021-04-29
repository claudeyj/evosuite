package org.evosuite.instrumentation.certaintyTransformation.MethodAnalyser.ByteCodeInstructions.StoreInstructions;

import org.evosuite.instrumentation.certaintyTransformation.MethodAnalyser.StackManipulation.StackTypeSet;

import static org.objectweb.asm.Opcodes.ASTORE;

public class AStoreInstruction extends StoreInstruction {
    public AStoreInstruction(String className, String methodName, int line,String methodDescriptor, int localVariableIndex,
                             int instructionNumber) {
        super(className, methodName, line, methodDescriptor, "ASTORE " + localVariableIndex, localVariableIndex, instructionNumber,
                StackTypeSet.AO, ASTORE);
    }
}