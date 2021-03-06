package com.amazonaws.mobile.client;

import android.app.Activity;

/**
 * UI options for showSignIn in MobileClient
 * Follows a builder pattern.
 */
public class SignInUIOptions {

    private final Builder builder;

    SignInUIOptions(final Builder builder) {
        this.builder = builder;
    }

    public String getBrowserPackage() { return builder.browserPackage; }

    public Integer getLogo() {
        return builder.logo;
    }

    public Integer getBackgroundColor() {
        return builder.backgroundColor;
    }

    public boolean canCancel() {
        return builder.canCancel;
    }

    public Class<? extends Activity> nextActivity() {
        return builder.nextActivityClass;
    }

    public HostedUIOptions getHostedUIOptions() {
        return builder.hostedUIOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String browserPackage;
        private Integer logo;
        private Integer backgroundColor;
        private boolean canCancel;
        private Class<? extends Activity> nextActivityClass;
        private HostedUIOptions hostedUIOptions;

        public Builder() { }

        public Builder logo(final Integer logoResourceId) {
            logo = logoResourceId;
            return this;
        }

        /**
         * Specify which browser package to use for the sign in operation (e.g. "org.mozilla.firefox").
         * Defaults to the Chrome package if not specified.
         * @param browserPackage the browser package to use for the sign in operation (e.g. "org.mozilla.firefox").
         * @return The builder object.
         */
        public Builder browserPackage(final String browserPackage) {
            this.browserPackage = browserPackage;
            return this;
        }

        public Builder backgroundColor(final Integer logoResourceId) {
            backgroundColor = logoResourceId;
            return this;
        }

        public Builder canCancel(final boolean canCancel) {
            this.canCancel = canCancel;
            return this;
        }

        public Builder nextActivity(final Class<? extends Activity> nextActivityClass) {
            this.nextActivityClass = nextActivityClass;
            return this;
        }

        public Builder hostedUIOptions(final HostedUIOptions hostedUIOptions) {
            this.hostedUIOptions = hostedUIOptions;
            return this;
        }

        public SignInUIOptions build() {
            return new SignInUIOptions(this);
        }
    }
}
