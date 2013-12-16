package ucar.sparr;

import java.util.Formatter;

/**
 * Count stats
 *
 * @author John
 * @since 11/30/13
 */
public class Counter {
    public int recordsTotal;
    public int recordsUnique;
    public int dups;
    public int filter;
    public int vars;

    public String show () {
      Formatter f = new Formatter();
      float dupPercent = ((float) dups) / (recordsTotal);
      float density = ((float) recordsUnique) / (recordsTotal);
      f.format(" Counter: nvars=%d records %d/%d (%f) filtered=%d dups=%d (%f)%n",
              vars, recordsUnique, recordsTotal, density, filter, dups, dupPercent);
      return f.toString();
    }

    public void add(Counter c) {
      this.recordsUnique += c.recordsUnique;
      this.dups += c.dups;
      this.vars += c.vars;
    }

}
