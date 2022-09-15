public class PosterManager {

    int resultLength = 10;

    public PosterManager() {

    }

    public PosterManager(int resultLength) {
        if (resultLength <= 0) {
            resultLength = 10;
        }
        this.resultLength = resultLength;
    }

    public PosterItem[] items = new PosterItem[0];

    public void save(PosterItem item) {

        PosterItem[] tmp = new PosterItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[items.length] = item;
        items = tmp;
    }

    public PosterItem[] findAll() {
        return items;
    }

    public PosterItem[] findLast() {
        if (items.length < resultLength) {
            resultLength = items.length;
        }
        PosterItem[] result = new PosterItem[resultLength];
        int revCount = items.length - 1;
        for (int i = 0; i <= resultLength - 1; i++) {
            result[i] = items[revCount];
            revCount = revCount - 1;
        }
        return result;
    }
}
