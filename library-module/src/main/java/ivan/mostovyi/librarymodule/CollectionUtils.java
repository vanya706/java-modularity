package ivan.mostovyi.librarymodule;

import java.util.Collection;
import java.util.Objects;

public class CollectionUtils {

    public static <T> T getFirstNotNull(Collection<T> collection) {
        return Objects.requireNonNull(collection).stream()
                .filter(Objects::nonNull)
                .findFirst()
                .orElse(null);
    }

}
