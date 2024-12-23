import java.util.*;

public class TopologicalSort {

    public static void main(String[] args) {
        
        int vertices = 33;

        List<List<Integer>> adjacencyList = new ArrayList<>();

        for (int i = 0 ; i < vertices ; i++)
            adjacencyList.add(new ArrayList<>());

        addEdge(adjacencyList, 0, 4); //IC111 -> IC124
        addEdge(adjacencyList, 2, 5); //IC113 -> IC125
        addEdge(adjacencyList, 3, 5); //CS111 -> IC125
        addEdge(adjacencyList, 2, 7); //IC113 -> CS122
        addEdge(adjacencyList, 1, 7); //IC112 -> CS122
        addEdge(adjacencyList, 4, 8); //IC124 -> IC217
        addEdge(adjacencyList, 5, 8); //IC125 -> IC217
        addEdge(adjacencyList, 7, 9); //CS122 -> CS213
        addEdge(adjacencyList, 5, 10); //IC125 -> IC214
        addEdge(adjacencyList, 4, 11); //IC124 -> CS215 
        addEdge(adjacencyList, 5, 11); //IC125 -> CS215
        addEdge(adjacencyList, 8, 12); //IC217 -> CS226
        addEdge(adjacencyList, 11, 13); //CS215 -> CS227
        addEdge(adjacencyList, 11, 14); //CS215 -> CS228
        addEdge(adjacencyList, 6, 15); //IC126 -> CS229
        addEdge(adjacencyList, 12, 16); //CS226 -> CSDS311
        addEdge(adjacencyList, 15, 17); //CS229 -> CSDS312
        addEdge(adjacencyList, 12, 18); //CS226 -> CSDS313
        addEdge(adjacencyList, 14, 19); //CS228 -> CSDS314
        addEdge(adjacencyList, 13, 20); //CS227 -> CS3110
        addEdge(adjacencyList, 0, 21); //IC111 -> ICE311
        addEdge(adjacencyList, 1, 21); //IC112 -> ICE311
        addEdge(adjacencyList, 2, 21); //IC113 -> ICE311
        addEdge(adjacencyList, 3, 21); //CS111 -> ICE311
        addEdge(adjacencyList, 0, 21); //IC111 -> ICE311
        addEdge(adjacencyList, 4, 21); //IC124 -> ICE311
        addEdge(adjacencyList, 5, 21); //IC125 -> ICE311
        addEdge(adjacencyList, 6, 21); //IC126 -> ICE311
        addEdge(adjacencyList, 7, 21); //CS122 -> ICE311
        addEdge(adjacencyList, 8, 21); //IC217 -> ICE311
        addEdge(adjacencyList, 9, 21); //CS213 -> ICE311
        addEdge(adjacencyList, 10, 21); //IC214 -> ICE311
        addEdge(adjacencyList, 11, 21); //CS215 -> ICE311
        addEdge(adjacencyList, 12, 21); //CS226 -> ICE311
        addEdge(adjacencyList, 13, 21); //CS227 -> ICE311
        addEdge(adjacencyList, 14, 21); //CS228 -> ICE311
        addEdge(adjacencyList, 15, 21); //CS229 -> ICE311
        addEdge(adjacencyList, 18, 22); //CSDS313 -> CSDS325
        addEdge(adjacencyList, 19, 22); //CSDS314 -> CSDS325
        addEdge(adjacencyList, 16, 23); //CSDS311 -> CSDS326
        addEdge(adjacencyList, 17, 23); //CSDS312 -> CSDS326
        addEdge(adjacencyList, 16, 24); //CSDS311 -> CSDS327
        addEdge(adjacencyList, 17, 24); //CSDS312 -> CSDS327

        addEdge(adjacencyList, 0, 25); //IC111 -> ICE322
        addEdge(adjacencyList, 1, 25); //IC112 -> ICE322
        addEdge(adjacencyList, 2, 25); //IC113 -> ICE322
        addEdge(adjacencyList, 3, 25); //CS111 -> ICE322
        addEdge(adjacencyList, 0, 25); //IC111 -> ICE322
        addEdge(adjacencyList, 4, 25); //IC124 -> ICE322
        addEdge(adjacencyList, 5, 25); //IC125 -> ICE322
        addEdge(adjacencyList, 6, 25); //IC126 -> ICE322
        addEdge(adjacencyList, 7, 25); //CS122 -> ICE322
        addEdge(adjacencyList, 8, 25); //IC217 -> ICE322
        addEdge(adjacencyList, 9, 25); //CS213 -> ICE322
        addEdge(adjacencyList, 10, 25); //IC214 -> ICE322
        addEdge(adjacencyList, 11, 25); //CS215 -> ICE322
        addEdge(adjacencyList, 12, 25); //CS226 -> ICE322
        addEdge(adjacencyList, 13, 25); //CS227 -> ICE322
        addEdge(adjacencyList, 14, 25); //CS228 -> ICE322
        addEdge(adjacencyList, 15, 25); //CS229 -> ICE322
        addEdge(adjacencyList, 16, 25); //CSDS311 -> ICE322
        addEdge(adjacencyList, 17, 25); //CSDS312 -> ICE322
        addEdge(adjacencyList, 18, 25); //CSDS313 -> ICE322
        addEdge(adjacencyList, 19, 25); //CSDS314 -> ICE322
        addEdge(adjacencyList, 20, 25); //CS3110 -> ICE322
        addEdge(adjacencyList, 21, 25); //ICE311 -> ICE322

        addEdge(adjacencyList, 0, 26); //IC111 -> ICE322
        addEdge(adjacencyList, 1, 26); //IC112 -> ICE322
        addEdge(adjacencyList, 2, 26); //IC113 -> ICE322
        addEdge(adjacencyList, 3, 26); //CS111 -> ICE322
        addEdge(adjacencyList, 0, 26); //IC111 -> ICE322
        addEdge(adjacencyList, 4, 26); //IC124 -> ICE322
        addEdge(adjacencyList, 5, 26); //IC125 -> ICE322
        addEdge(adjacencyList, 6, 26); //IC126 -> ICE322
        addEdge(adjacencyList, 7, 26); //CS122 -> ICE322
        addEdge(adjacencyList, 8, 26); //IC217 -> ICE322
        addEdge(adjacencyList, 9, 26); //CS213 -> ICE322
        addEdge(adjacencyList, 10, 26); //IC214 -> ICE322
        addEdge(adjacencyList, 11, 26); //CS215 -> ICE322
        addEdge(adjacencyList, 12, 26); //CS226 -> ICE322
        addEdge(adjacencyList, 13, 26); //CS227 -> ICE322
        addEdge(adjacencyList, 14, 26); //CS228 -> ICE322
        addEdge(adjacencyList, 15, 26); //CS229 -> ICE322
        addEdge(adjacencyList, 16, 26); //CSDS311 -> ICE322
        addEdge(adjacencyList, 17, 26); //CSDS312 -> ICE322
        addEdge(adjacencyList, 18, 26); //CSDS313 -> ICE322
        addEdge(adjacencyList, 19, 26); //CSDS314 -> ICE322
        addEdge(adjacencyList, 20, 26); //CS3110 -> ICE322
        addEdge(adjacencyList, 21, 26); //ICE311 -> ICE322

        addEdge(adjacencyList, 12, 27); //CS226 -> CS3211

        addEdge(adjacencyList, 0, 29); //IC111 -> CSPR311
        addEdge(adjacencyList, 1, 29); //IC112 -> CSPR311
        addEdge(adjacencyList, 2, 29); //IC113 -> CSPR311
        addEdge(adjacencyList, 3, 29); //CS111 -> CSPR311
        addEdge(adjacencyList, 0, 29); //IC111 -> CSPR311
        addEdge(adjacencyList, 4, 29); //IC124 -> CSPR311
        addEdge(adjacencyList, 5, 29); //IC125 -> CSPR311
        addEdge(adjacencyList, 6, 29); //IC126 -> CSPR311
        addEdge(adjacencyList, 7, 29); //CS122 -> CSPR311
        addEdge(adjacencyList, 8, 29); //IC217 -> CSPR311
        addEdge(adjacencyList, 9, 29); //CS213 -> CSPR311
        addEdge(adjacencyList, 10, 29); //IC214 -> CSPR311
        addEdge(adjacencyList, 11, 29); //CS215 -> CSPR311
        addEdge(adjacencyList, 12, 29); //CS226 -> CSPR311
        addEdge(adjacencyList, 13, 29); //CS227 -> CSPR311
        addEdge(adjacencyList, 14, 29); //CS228 -> CSPR311
        addEdge(adjacencyList, 15, 29); //CS229 -> CSPR311
        addEdge(adjacencyList, 16, 29); //CSDS311 -> CSPR311
        addEdge(adjacencyList, 17, 29); //CSDS312 -> CSPR311
        addEdge(adjacencyList, 18, 29); //CSDS313 -> CSPR311
        addEdge(adjacencyList, 19, 29); //CSDS314 -> CSPR311
        addEdge(adjacencyList, 20, 29); //CS3110 -> CSPR311
        addEdge(adjacencyList, 21, 29); //ICE311 -> CSPR311
        addEdge(adjacencyList, 22, 29); //CSDS325 -> CSPR311
        addEdge(adjacencyList, 23, 29); //CSDS326 -> CSPR311
        addEdge(adjacencyList, 24, 29); //CSDS327 -> CSPR311
        addEdge(adjacencyList, 25, 29); //ICE122 -> CSPR311
        addEdge(adjacencyList, 26, 29); //ICE323 -> CSPR311
        addEdge(adjacencyList, 27, 29); //CS3211 -> CSPR311

        addEdge(adjacencyList, 0, 30); //IC111 -> ICE414
        addEdge(adjacencyList, 1, 30); //IC112 -> ICE414
        addEdge(adjacencyList, 2, 30); //IC113 -> ICE414
        addEdge(adjacencyList, 3, 30); //CS111 -> ICE414
        addEdge(adjacencyList, 0, 30); //IC111 -> ICE414
        addEdge(adjacencyList, 4, 30); //IC124 -> ICE414
        addEdge(adjacencyList, 5, 30); //IC125 -> ICE414
        addEdge(adjacencyList, 6, 30); //IC126 -> ICE414
        addEdge(adjacencyList, 7, 30); //CS122 -> ICE414
        addEdge(adjacencyList, 8, 30); //IC217 -> ICE414
        addEdge(adjacencyList, 9, 30); //CS213 -> ICE414
        addEdge(adjacencyList, 10, 30); //IC214 -> ICE414
        addEdge(adjacencyList, 11, 30); //CS215 -> ICE414
        addEdge(adjacencyList, 12, 30); //CS226 -> ICE414
        addEdge(adjacencyList, 13, 30); //CS227 -> ICE414
        addEdge(adjacencyList, 14, 30); //CS228 -> ICE414
        addEdge(adjacencyList, 15, 30); //CS229 -> ICE414
        addEdge(adjacencyList, 16, 30); //CSDS311 -> ICE414
        addEdge(adjacencyList, 17, 30); //CSDS312 -> ICE414
        addEdge(adjacencyList, 18, 30); //CSDS313 -> ICE414
        addEdge(adjacencyList, 19, 30); //CSDS314 -> ICE414
        addEdge(adjacencyList, 20, 30); //CS3110 -> ICE414
        addEdge(adjacencyList, 21, 30); //ICE311 -> ICE414
        addEdge(adjacencyList, 22, 30); //CSDS325 -> ICE414
        addEdge(adjacencyList, 23, 30); //CSDS326 -> ICE414
        addEdge(adjacencyList, 24, 30); //CSDS327 -> ICE414
        addEdge(adjacencyList, 25, 30); //ICE122 -> ICE414
        addEdge(adjacencyList, 26, 30); //ICE323 -> ICE414
        addEdge(adjacencyList, 27, 30); //CS3211 -> ICE414
        addEdge(adjacencyList, 29, 30); //CSPR331 -> ICE414

        addEdge(adjacencyList, 0, 31); //IC111 -> ICE415
        addEdge(adjacencyList, 1, 31); //IC112 -> ICE415
        addEdge(adjacencyList, 2, 31); //IC113 -> ICE415
        addEdge(adjacencyList, 3, 31); //CS111 -> ICE415
        addEdge(adjacencyList, 0, 31); //IC111 -> ICE415
        addEdge(adjacencyList, 4, 31); //IC124 -> ICE415
        addEdge(adjacencyList, 5, 31); //IC125 -> ICE415
        addEdge(adjacencyList, 6, 31); //IC126 -> ICE415
        addEdge(adjacencyList, 7, 31); //CS122 -> ICE415
        addEdge(adjacencyList, 8, 31); //IC217 -> ICE415
        addEdge(adjacencyList, 9, 31); //C213 -> ICE415
        addEdge(adjacencyList, 10, 31); //IC214 -> ICE415
        addEdge(adjacencyList, 11, 31); //CS215 -> ICE415
        addEdge(adjacencyList, 12, 31); //CS226 -> ICE415
        addEdge(adjacencyList, 13, 31); //CS227 -> ICE415
        addEdge(adjacencyList, 14, 31); //CS228 -> ICE415
        addEdge(adjacencyList, 15, 31); //CS229 -> ICE415
        addEdge(adjacencyList, 16, 31); //CSDS311 -> ICE415
        addEdge(adjacencyList, 17, 31); //CSDS312 -> ICE415
        addEdge(adjacencyList, 18, 31); //CSDS313 -> ICE415
        addEdge(adjacencyList, 19, 31); //CSDS314 -> ICE415
        addEdge(adjacencyList, 20, 31); //CS3110 -> ICE415
        addEdge(adjacencyList, 21, 31); //ICE311 -> ICE415
        addEdge(adjacencyList, 22, 31); //CSDS325 -> ICE415
        addEdge(adjacencyList, 23, 31); //CSDS326 -> ICE415
        addEdge(adjacencyList, 24, 31); //CSDS327 -> ICE415
        addEdge(adjacencyList, 25, 31); //ICE122 -> ICE415
        addEdge(adjacencyList, 26, 31); //ICE323 -> ICE415
        addEdge(adjacencyList, 27, 31); //CS3211 -> ICE415
        addEdge(adjacencyList, 29, 31); //CSPR331 -> ICE415

        addEdge(adjacencyList, 0, 32); //IC111 -> CS4212
        addEdge(adjacencyList, 1, 32); //IC112 -> CS4212
        addEdge(adjacencyList, 2, 32); //IC113 -> CS4212
        addEdge(adjacencyList, 3, 32); //CS111 -> CS4212
        addEdge(adjacencyList, 0, 32); //IC111 -> CS4212
        addEdge(adjacencyList, 4, 32); //IC124 -> CS4212
        addEdge(adjacencyList, 5, 32); //IC125 -> CS4212
        addEdge(adjacencyList, 6, 32); //IC126 -> CS4212
        addEdge(adjacencyList, 7, 32); //CS122 -> CS4212
        addEdge(adjacencyList, 8, 32); //IC217 -> CS4212
        addEdge(adjacencyList, 9, 32); //CS213 -> CS4212
        addEdge(adjacencyList, 10, 32); //IC214 -> CS4212
        addEdge(adjacencyList, 11, 31); //CS215 -> CS4212
        addEdge(adjacencyList, 12, 32); //CS226 -> CS4212
        addEdge(adjacencyList, 13, 32); //CS227 -> CS4212
        addEdge(adjacencyList, 14, 32); //CS228 -> CS4212
        addEdge(adjacencyList, 15, 32); //CS229 -> CS4212
        addEdge(adjacencyList, 16, 32); //CSDS311 -> CS4212
        addEdge(adjacencyList, 17, 32); //CSDS312 -> CS4212
        addEdge(adjacencyList, 18, 32); //CSDS313 -> CS4212
        addEdge(adjacencyList, 19, 32); //CSDS314 -> CS4212
        addEdge(adjacencyList, 20, 32); //CS3110 -> CS4212
        addEdge(adjacencyList, 21, 32); //ICE311 -> CS4212
        addEdge(adjacencyList, 22, 32); //CSDS325 -> CS4212
        addEdge(adjacencyList, 23, 32); //CSDS326 -> CS4212
        addEdge(adjacencyList, 24, 32); //CSDS327 -> CS4212
        addEdge(adjacencyList, 25, 32); //ICE122 -> CS4212
        addEdge(adjacencyList, 26, 32); //ICE323 -> CS4212
        addEdge(adjacencyList, 27, 32); //CS3211 -> CS4212
        addEdge(adjacencyList, 29, 32); //CSPR331 -> CS4212
        addEdge(adjacencyList, 30, 32); //ICE414 -> CS4212
        addEdge(adjacencyList, 31, 32); //ICE415 -> CS4212

        addEdge(adjacencyList, 27, 28); //CS3211 -> THESIS400
        
        // Topological Order will vary based on the starting point.

        for(int i = 0 ; i <= 32 ; i++) {

            System.out.println("\nTopological Sort #" + (i+1)); 

            List<String> result = topologicalSort(i, vertices, adjacencyList);

            for (String course: result) {

                if(result.getLast().equals(course)) System.out.print(course);
                else System.out.print(course + " -> ");
            }

            System.out.println();
        }
    }

    public static void addEdge(List<List<Integer>> adjacencyList, int source, int target) {
        adjacencyList.get(source).add(target);
    }

    public static List<String> topologicalSort(int i, int vertices, List<List<Integer>> adjacencyList) {

        int counter = 0;

        boolean[] visited = new boolean[vertices];
        boolean[] recStack = new boolean[vertices];
        Stack<Integer> myStack = new Stack<>();

        while (counter <= 33) {

            if(!visited[i] && !dfs(i, adjacencyList, visited, recStack, myStack)) return null;

            if(i+1 > 32) i = 0;
            else i++;

            counter++;
        }

        List<String> topoOrder = new ArrayList<>();
        while(!myStack.isEmpty()) {

            topoOrder.add(numEquivalent(myStack.pop()));
        }

        return topoOrder;
    }

    private static boolean dfs(int current, List<List<Integer>> adjacencyList, boolean[] visited, boolean[] recStack, Stack<Integer> myStack) {

        visited[current] = true;
        recStack[current] = true;

        for(int neighbor : adjacencyList.get(current)) {

            if(!visited[neighbor] && !dfs(neighbor, adjacencyList, visited, recStack, myStack)) return false;
            else if (recStack[neighbor]) return false;
        }

        recStack[current] = false;
        myStack.push(current);
        return true;
    }

    public static String numEquivalent (int num) {

        switch(num) {

            case 0: return "IC111";
            case 1: return "IC112";
            case 2: return "IC113";
            case 3: return "CS111";
            case 4: return "IC124";
            case 5: return "IC125";
            case 6: return "IC126";
            case 7: return "CS122";
            case 8: return "IC217";
            case 9: return "CS213";
            case 10: return "IC214";
            case 11: return "CS215";
            case 12: return "CS226";
            case 13: return "CS227";
            case 14: return "CS228";
            case 15: return "CS229";
            case 16: return "CSDS311";
            case 17: return "CSDS312";
            case 18: return "CSDS313";
            case 19: return "CSDS314";
            case 20: return "CS3110";
            case 21: return "ICE311";
            case 22: return "CSDS325";
            case 23: return "CSDS326";
            case 24: return "CSDS327";
            case 25: return "ICE322";
            case 26: return "ICE323";
            case 27: return "CS3211";
            case 28: return "THESIS400";
            case 29: return "CSPR331";
            case 30: return "ICE414";
            case 31: return "ICE415";
            case 32: return "CS4212";
        }

        return null;
    }
}