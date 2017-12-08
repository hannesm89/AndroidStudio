package hm.android.myapplication;


public class Termin 
{
	private final String[] prioText = { "  *", " **", "***" };
	private long id;
	private int jahr;
	private int monat;
	private int tag;
	private int prio;
	private String comment;
	
	Termin() {
		id = -1;			// kein gueltiger DB-ID fuer Termine
	}
	
	Termin(int jahr, int monat, int tag, int prio, String txt) {
		id = -1;			// kein gueltiger DB-ID fuer Termine
		this.jahr = jahr;
		this.monat = monat;
		this.tag = tag;
		this.prio = prio;
		this.comment = txt;
	}
	
	public int getPrio() {
		return prio;
	}

	public void setPrio(int prio) {
		this.prio = prio;
	}


	public long getId() {
		return id;
	}

	public int getJahr() {
		return jahr;
	}

	public void setJahr(int jahr) {
		this.jahr = jahr;
	}

	public int getMonat() {
		return monat;
	}

	public void setMonat(int monat) {
		this.monat = monat;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	// Will be used by the ArrayAdapter in the ListView
	@Override
	public String toString() {
		return id + ": " + tag + "." + monat + "." + jahr + " [" + prioText[prio] + "] " + comment;
	}
}
