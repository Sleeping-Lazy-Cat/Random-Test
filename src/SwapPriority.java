public class SwapPriority implements Event{

    @Override
    public String getDetails() {
        return "Swap priotity to " + newPriority;
    }
}
