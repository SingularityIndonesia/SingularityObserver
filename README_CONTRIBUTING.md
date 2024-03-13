# Contributing
Open for contribution.

## Pattern convention
Designed by [Stefanus Ayudha](https://github.com/stefanusayudha).

The `base` branch serves as the pattern convention for this application. It represents the minimum example of the application and is used as the standard pattern for contributors.

Every contributor is required to adhere to this established pattern and architecture.

## Git flow
![Screenshot 2024-03-10 at 19.35.03.png](Docs%2FScreenshot%202024-03-10%20at%2019.35.03.png)
See: [Singularity Gitflow - Miro.](https://miro.com/app/board/uXjVMS5Omk8=/?share_link_id=784438148126)

## Commit convention
- `fix($scope): $message.`

  To commit a bug fix.
- `feat($scope): $message.`

  To commit a feature.
- `BREAKING CHANGE($scope): $message.`

  To commit breaking changes (rename, replace, move, delete, etc.) in the context of "not bug fixing".
- `doc($scope): $message.`

  To commit documentation.

**Note: Committing changes with side effect**<br/>
If your changes somehow affecting another module that is not associated with your module / scope, and somehow you cannot separate them to separated commits, you must add `!` at the beginning of your commit message and add `ALSO:` to provides the effects.

eg:
```
!fix(LoginScreen): add error handler for MCancelationException.
ALSO:
- ($scope): $changes.
- ($scope): $changes. 
```

Resources category includes: Strings, Icons.

## Commit Procedure
Commit the lowest module first.

1. Set the commit view into module.

   ![Screenshot 2024-03-10 at 19.14.55.png](Docs%2FScreenshot%202024-03-10%20at%2019.14.55.png)
2. Commit modules in order from the lowest to highest.

   ![Screenshot 2024-03-10 at 19.19.43.png](Docs%2FScreenshot%202024-03-10%20at%2019.19.43.png)

3. Commit only what is necessary.

   ![Screenshot 2024-03-10 at 19.21.44.png](Docs%2FScreenshot%202024-03-10%20at%2019.21.44.png)