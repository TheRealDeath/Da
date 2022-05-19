class minPath
{
    private ArrayList<Node> minPath;
    private int minWeight;
    private Graph g;
    pubic minPath(Graph g) {this.g = g;minPath = new ArrayList<>();weights = Integer.MAX_VALUE;}
    public void minDistance(Node start, Node end, int weight, ArrayList<Node> path, boolean firstIteration)
    {
        if(start.equals(end) && weight < minWeight) {minPath = path;minWeight = weight;}
        for(int i = 0;i<start.arraysize;i++) return minDistance(start.get(i),end,weight+start.getWeight());
    }
    public int getMinWeight() {return minWeight;}
    public ArrayList<Node> minPath() {return minPath;}
}
