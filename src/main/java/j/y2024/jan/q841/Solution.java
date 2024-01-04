package j.y2024.jan.q841;

import java.util.List;

/**
 * 841. Keys and Rooms
 * Recursively visit the rooms.
 * Use an array to mark the rooms visited.
 * When visit the room, if the room is visited, skip
 * the visiting.
 * After all the visiting, find out if all the rooms are visited.
 */
public class Solution {

    private int[] visited = new int[1000];

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        if (n == 0) {
            return true;
        }
        visitRoom(0, rooms);
        for (int i=0; i<n; i++) {
            if (visited[i] != 1) {
                return false;
            }
        }

        return true;
    }

    private void visitRoom(int room, List<List<Integer>> rooms) {
        if (visited[room] == 1) {
            return;
        }

        visited[room] = 1;

        for (int key : rooms.get(room)) {
            visitRoom(key, rooms);
        }
    }
}
