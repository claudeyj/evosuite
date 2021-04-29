package org.evosuite.instrumentation.certaintyTransformation.MethodAnalyser.ByteCodeInstructions.PushInstructions;

import org.evosuite.instrumentation.certaintyTransformation.MethodAnalyser.ByteCodeInstructions.ByteCodeInstruction;
import org.evosuite.instrumentation.certaintyTransformation.MethodAnalyser.StackManipulation.StackTypeSet;

import java.util.Collections;
import java.util.List;

public abstract class PushInstruction extends ByteCodeInstruction {
    private final StackTypeSet pushedType;

    public PushInstruction(String className, String methodName, int lineNumber,String methodDescriptor, String label, int instructionNumber,
                           StackTypeSet pushedType, int opcode) {
        super(className, methodName, lineNumber, methodDescriptor, label, instructionNumber, opcode);
        this.pushedType = pushedType;
    }

    @Override
    public List<StackTypeSet> consumedFromStack() {
        return Collections.emptyList();
    }

    @Override
    public StackTypeSet pushedToStack() {
        return pushedType;
    }

    @Override
    public boolean writesVariable(int index){
        return false;
    }
}