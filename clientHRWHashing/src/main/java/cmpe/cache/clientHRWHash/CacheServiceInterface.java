package cmpe.cache.clientHRWHash;

/**********************
 * Cache Service Interface
 * @author Raghavendra Reddy
 *
 */
public interface CacheServiceInterface {
    public String get(long key);

    public void put(long key, String value);
}
