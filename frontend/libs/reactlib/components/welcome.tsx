import { getTodayDate } from '@multi-stack-monorepo/commonlib';
import styles from './welcome.module.scss';

/* eslint-disable-next-line */
export interface WelcomeProps {}

export function Welcome(props: WelcomeProps) {
  const today = getTodayDate().toDateString();
  return (
    <div className={styles['welcome']}>
      <h1>Welcome again, from <strong>reactlib!</strong></h1>
      <p>Today is: <strong>{today}</strong></p>
    </div>
  );
}

export default Welcome;
