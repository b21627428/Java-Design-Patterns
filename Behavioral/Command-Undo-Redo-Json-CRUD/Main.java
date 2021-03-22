public class Main {

    public static void main(String argv[]) {
        GUI gui = new GUI(new Invoker(new Middleware(new JsonDAO())));
        Block block = new Block();
        block.addStringStringPair("mertcan", "21627471");
        Block innerBlock = new Block();
        innerBlock.addStringStringPair("BBM486", 1.21);
        innerBlock.addStringStringPair("BBM451", false);
        Block innerBlock2 = new Block();
        innerBlock2.addStringStringPair("BBM486", 1L);
        innerBlock2.addStringStringPair("BBM451", 4);
        innerBlock.addStringBlockPair("yeni", innerBlock2);
        block.addStringBlockPair("courses", innerBlock);

        gui.addElement(block);
        gui.addElement(block);
        gui.removeElement(block);
        gui.commit();
    }

}
