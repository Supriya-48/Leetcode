class Solution {
    public String interpret(String command) {
        command =String.valueOf(command.replace("()","o").replace("(al)","al"));
        return command;
    }
}