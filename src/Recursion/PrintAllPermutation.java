package Recursion;

import java.util.ArrayList;
import java.util.List;
public class PrintAllPermutation {
static void main() {
int[] values = {1, 2, 3};
List<List<Integer>> output = new ArrayList<>();
boolean[] visited = new boolean[values.length];

generate(values, new ArrayList<>(), visited, output);
System.out.println(output);
}

static void generate(int[] values, List<Integer> path, boolean[] visited, List<List<Integer>> output) {
if (path.size() == values.length) {
output.add(new ArrayList<>(path));
return;
}

for (int i = 0; i < values.length; i++) {
if (visited[i]) continue;
visited[i] = true;
path.add(values[i]);
generate(values, path, visited, output);
path.remove(path.size() - 1);
visited[i] = false;
}
}
}