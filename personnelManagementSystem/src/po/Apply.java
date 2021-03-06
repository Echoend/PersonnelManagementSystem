package po;

import java.util.Date;

/**

 * Apply

 * @author Qin Hao

 * @date 2020/5/27

 *

 */

public class Apply {

	private int id;

	private int playerid;

	private String content;

	private Date date;

	

	public Apply() {

		super();

	}

	

	public Apply(int id, int playerid, String content, Date date) {

		super();

		this.id = id;

		this.playerid = playerid;

		this.content = content;

		this.date = date;

	}



	public int getId() {

		return id;

	}



	public void setId(int id) {

		this.id = id;

	}



	public int getPlayerid() {

		return playerid;

	}



	public void setPlayerid(int playerid) {

		this.playerid = playerid;

	}



	public String getContent() {

		return content;

	}



	public void setContent(String content) {

		this.content = content;

	}



	public Date getDate() {

		return date;

	}



	public void setDate(Date date) {

		this.date = date;

	}



	//@Override

	public String toString() {

		return "Apply [id=" + id + ", playerid=" + playerid + ", content=" + 

				content + ", date=" + date + "]";

	}

}