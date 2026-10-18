#!/usr/bin/env bash
#
# Generates the gh-pages index.html listing all Javadoc releases.
# Must be run from inside the gh-pages working directory (where docs/ lives).
# Stdout is the complete HTML document.
#
# Required environment variables:
#   GH_TAG  - the latest release tag (used for the "Latest release" label)

set -euo pipefail

: "${GH_TAG:?GH_TAG environment variable is required}"

cat <<HTML
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>IBM Cloud Networking Services Java SDK — Javadoc</title>
    <!-- IBM Plex Sans -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans:wght@400;600&display=swap">
    <style>
        *, *::before, *::after { box-sizing: border-box; margin: 0; padding: 0; }

        body {
            font-family: 'IBM Plex Sans', 'Helvetica Neue', Arial, sans-serif;
            font-size: 14px;
            line-height: 1.5;
            background: #f4f4f4;
            color: #161616;
        }

        /* ── Carbon-style header bar ── */
        .bx--header {
            background: #161616;
            height: 48px;
            display: flex;
            align-items: center;
            padding: 0 16px;
            position: sticky;
            top: 0;
            z-index: 100;
        }
        .bx--header__name {
            color: #f4f4f4;
            font-size: 14px;
            font-weight: 600;
            text-decoration: none;
            letter-spacing: 0.1px;
        }
        .bx--header__name span { font-weight: 400; color: #c6c6c6; }

        /* ── Page shell ── */
        .bx--content {
            max-width: 672px;
            margin: 0 auto;
            padding: 48px 16px 80px;
        }

        /* ── Breadcrumb ── */
        .bx--breadcrumb {
            display: flex;
            gap: 8px;
            font-size: 12px;
            color: #525252;
            margin-bottom: 24px;
            list-style: none;
        }
        .bx--breadcrumb li + li::before { content: '/'; margin-right: 8px; color: #c6c6c6; }
        .bx--breadcrumb a { color: #0f62fe; text-decoration: none; }
        .bx--breadcrumb a:hover { text-decoration: underline; }

        /* ── Page title ── */
        h1 {
            font-size: 28px;
            font-weight: 400;
            line-height: 1.3;
            color: #161616;
            margin-bottom: 8px;
        }
        .subtitle {
            font-size: 14px;
            color: #525252;
            margin-bottom: 40px;
        }

        /* ── Section heading ── */
        h2 {
            font-size: 14px;
            font-weight: 600;
            text-transform: uppercase;
            letter-spacing: 0.16px;
            color: #525252;
            margin-bottom: 8px;
        }

        /* ── Release list ── */
        .release-list { list-style: none; border-top: 1px solid #e0e0e0; }
        .release-list li {
            border-bottom: 1px solid #e0e0e0;
        }
        .release-list a {
            display: flex;
            align-items: center;
            justify-content: space-between;
            padding: 12px 16px 12px 0;
            color: #0f62fe;
            text-decoration: none;
            font-size: 14px;
            transition: background 70ms;
        }
        .release-list a:hover { background: #e8e8e8; padding-left: 8px; }
        .release-list a::after { content: '→'; color: #0f62fe; font-size: 16px; }
        .tag-latest {
            display: inline-block;
            font-size: 11px;
            font-weight: 600;
            background: #0f62fe;
            color: #fff;
            padding: 1px 6px;
            border-radius: 2px;
            margin-left: 8px;
            vertical-align: middle;
            letter-spacing: 0.3px;
        }

        /* ── Footer ── */
        footer {
            margin-top: 64px;
            padding-top: 16px;
            border-top: 1px solid #e0e0e0;
            font-size: 12px;
            color: #525252;
        }
        footer a { color: #0f62fe; text-decoration: none; }
        footer a:hover { text-decoration: underline; }
    </style>
</head>
<body>

<header class="bx--header">
    <a class="bx--header__name" href="https://github.com/IBM/networking-java-sdk">
        IBM <span>Cloud / Networking Services Java SDK</span>
    </a>
</header>

<main class="bx--content">

    <nav aria-label="Breadcrumb">
        <ol class="bx--breadcrumb">
            <li><a href="https://cloud.ibm.com/apidocs?category=network">IBM Cloud API Docs</a></li>
            <li><a href="https://github.com/IBM/networking-java-sdk">networking-java-sdk</a></li>
            <li>Javadoc</li>
        </ol>
    </nav>

    <h1>IBM Cloud Networking Services Java SDK</h1>
    <p class="subtitle">Javadoc reference — select a release to browse the API documentation.</p>

    <h2>Releases</h2>
    <ul class="release-list">
        <li>
            <a href="docs/${GH_TAG}">
                ${GH_TAG}<span class="tag-latest">latest</span>
            </a>
        </li>
HTML

for dir in docs/*/; do
    tag="${dir%/}"
    tag="${tag#docs/}"
    [ "$tag" = "$GH_TAG" ] && continue
    printf '        <li><a href="docs/%s">%s</a></li>\n' "$tag" "$tag"
done | sort -t. -k1,1rn -k2,2rn -k3,3rn

cat <<HTML
    </ul>

    <footer>
        <p>
            &copy; IBM Corporation &nbsp;|&nbsp;
            <a href="https://cloud.ibm.com/apidocs?category=network">Network Services API Docs</a> &nbsp;|&nbsp;
            <a href="https://github.com/IBM/networking-java-sdk">GitHub</a> &nbsp;|&nbsp;
            <a href="https://github.com/IBM/networking-java-sdk/blob/master/LICENSE">Apache 2.0 License</a>
        </p>
    </footer>

</main>
</body>
</html>
HTML
