class MinStack {

    private static class Entry {
        int value;
        int min;

        Entry(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }

    private Deque<Entry> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
    }

    public void push(int val) {
        int currentMin;

        if (stack.isEmpty()) {
            currentMin = val;
        } else {
            currentMin = Math.min(val, stack.peek().min);
        }

        stack.push(new Entry(val, currentMin));
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().min;
    }
}