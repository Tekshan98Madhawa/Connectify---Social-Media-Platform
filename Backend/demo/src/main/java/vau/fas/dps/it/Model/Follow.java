package vau.fas.dps.it.Model;

import vau.fas.dps.it.Model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Follow {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	@ManyToOne
	@JoinColumn(name = "follower_id")
	private User follower;
	
	@ManyToOne
	@JoinColumn(name = "following_id")
	
	private User following;

	public Follow(Long id, User follower, User following) {
		super();
		this.id = id;
		this.follower = follower;
		this.following = following;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getFollower() {
		return follower;
	}

	public void setFollower(User follower) {
		this.follower = follower;
	}

	public User getFollowing() {
		return following;
	}

	public void setFollowing(User following) {
		this.following = following;
	}
	
	
}
