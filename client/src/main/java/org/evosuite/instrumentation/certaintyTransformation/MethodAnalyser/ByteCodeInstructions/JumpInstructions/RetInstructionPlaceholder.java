package org.evosuite.instrumentation.certaintyTransformation.MethodAnalyser.ByteCodeInstructions.JumpInstructions;

import org.evosuite.instrumentation.certaintyTransformation.MethodAnalyser.ByteCodeInstructions.ByteCodeInstruction;
import org.evosuite.instrumentation.certaintyTransformation.MethodAnalyser.StackManipulation.StackTypeSet;
import org.objectweb.asm.Opcodes;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class RetInstructionPlaceholder extends ByteCodeInstruction{

    public RetInstructionPlaceholder(String className,
                                     String methodName,
                                     int lineNumber,String methodDescriptor,
                                     int instructionNumber) {
        super(className, methodName, lineNumber, methodDescriptor, "RET", instructionNumber, Opcodes.RET);
    }

    public RetInstruction setTargets(Set<ByteCodeInstruction> targets){
        return new RetInstruction(className,methodName,lineNumber,methodDescriptor,instructionNumber,targets);
    }

    @Override
    public List<StackTypeSet> consumedFromStack() {
        return Collections.emptyList();
    }

    @Override
    public StackTypeSet pushedToStack() {
        return StackTypeSet.VOID;
    }

    @Override
    public boolean writesVariable(int localVariableIndex) {
        return false;
    }
    @Override
    public Set<Integer> readsVariables(){
        return Collections.emptySet();
    }
    @Override
    public Set<Integer> writesVariables(){
        return Collections.emptySet();
    }
}