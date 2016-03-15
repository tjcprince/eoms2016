package com.boco.eoms.user.module;

import java.io.Serializable;

public class User implements Serializable {
    private Long id;

    private String email;

    private String password;

    private String displayName;

    private String facebook;

    private String google;

    private String linkedin;

    private String github;

    private String foursquare;

    private String twitter;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getGoogle() {
        return google;
    }

    public void setGoogle(String google) {
        this.google = google;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getFoursquare() {
        return foursquare;
    }

    public void setFoursquare(String foursquare) {
        this.foursquare = foursquare;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    private User(Builder b) {
        id = b.id;
        email = b.email;
        password = b.password;
        displayName = b.displayName;
        facebook = b.facebook;
        google = b.google;
        linkedin = b.linkedin;
        github = b.github;
        foursquare = b.foursquare;
        twitter = b.twitter;
    }

    public User() {
        super();
    }

    public static class Builder {
        private Long id;

        private String email;

        private String password;

        private String displayName;

        private String facebook;

        private String google;

        private String linkedin;

        private String github;

        private String foursquare;

        private String twitter;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder facebook(String facebook) {
            this.facebook = facebook;
            return this;
        }

        public Builder google(String google) {
            this.google = google;
            return this;
        }

        public Builder linkedin(String linkedin) {
            this.linkedin = linkedin;
            return this;
        }

        public Builder github(String github) {
            this.github = github;
            return this;
        }

        public Builder foursquare(String foursquare) {
            this.foursquare = foursquare;
            return this;
        }

        public Builder twitter(String twitter) {
            this.twitter = twitter;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}