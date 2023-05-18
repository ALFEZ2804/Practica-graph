/*Copyright [2023] [Alberto Fernández Rodríguez]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
either express or implied. See the License for the specific
language governing permissions and limitations under the
License.*/

package practicas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GraphTest {

    private Graph<Integer> graph;

    @Before
    public void setUp() {
        graph = new Graph();
    }

    @Test
    public void testAddVertex() {
        assertTrue(graph.addVertex(1));
        assertFalse(graph.addVertex(1));
    }

    @Test
    public void testAddEdge() {
        assertTrue(graph.addEdge(1, 2));
        assertFalse(graph.addEdge(1, 2));
    }

    @Test
    public void testContainsVertex() {
        graph.addVertex(1);
        assertTrue(graph.containsVertex(1));
        assertFalse(graph.containsVertex(2));
    }

    @Test
    public void testObtainAdjacents() throws Exception {
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        assertTrue(graph.obtainAdjacents(1).contains(2));
        assertTrue(graph.obtainAdjacents(1).contains(3));
    }

    @Test(expected = Exception.class)
    public void testObtainAdjacentsException() throws Exception {
        graph.obtainAdjacents(1);
    }

    @Test
    public void testOnePath() {
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);
        graph.addEdge(1, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 4);

        List<Integer> expectedPath = new ArrayList();
        expectedPath.add(1);
        expectedPath.add(5);
        expectedPath.add(6);
        expectedPath.add(4);

        assertEquals(expectedPath, graph.onePath(1, 4));
    }

    @Test
    public void testOnePathNotFound() {
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);
        graph.addEdge(1, 5);

        assertNull(graph.onePath(1, 4));
    }
}
